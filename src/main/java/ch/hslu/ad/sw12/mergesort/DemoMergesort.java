/*
 * Copyright 2020 Hochschule Luzern Informatik.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.hslu.ad.sw12.mergesort;

import ch.hslu.ad.sw12.array.init.RandomInitTask;
import ch.hslu.ad.sw12.array.sum.SumTask;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.ForkJoinPool;

/**
 * Performance Vergleich der Mergesort-Implementation.
 */
public final class DemoMergesort {

    private static final Logger LOG = LogManager.getLogger(DemoMergesort.class);

    /**
     * Privater Konstruktor.
     */
    private DemoMergesort() {
    }

    /**
     * Main-Demo.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {
        final int size = 30_000_000;
        final int[] array = new int[size];
        final ForkJoinPool pool = new ForkJoinPool();
        RandomInitTask initTask = new RandomInitTask(array, 100);
        pool.invoke(initTask);
        for(int i= 0; i < 2; i++){
            SumTask sumTask = new SumTask(array);
            long result = pool.invoke(sumTask);
            LOG.info("Init. Checksum  : " + result);
            long startTime = System.currentTimeMillis();
            final MergesortTask sortTask = new MergesortTask(array);
            pool.invoke(sortTask);
            long endTime =  System.currentTimeMillis();
            LOG.info("Conc. Mergesort : " + (endTime - startTime)  + " sec.");
            sumTask = new SumTask(array);
            result = pool.invoke(sumTask);
            LOG.info("Merge Checksum  : " + result);
            initTask = new RandomInitTask(array, 100);
            pool.invoke(initTask);
            sumTask = new SumTask(array);
            result = pool.invoke(sumTask);
            LOG.info("Init. checksum  : " + result);
            startTime = System.currentTimeMillis();
            MergesortRecursive.mergeSort(array);
            endTime = System.currentTimeMillis();
            LOG.info("MergesortRec.   : " + (endTime - startTime)  + " sec.");
            sumTask = new SumTask(array);
            result = pool.invoke(sumTask);
            LOG.info("Sort checksum   : " + result);
        }

    }
}
