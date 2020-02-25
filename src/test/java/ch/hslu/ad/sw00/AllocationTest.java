package ch.hslu.ad.sw00;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class AllocationTest {

    @Test
    void testgetSizeShouldReturnSize() {
        // Arrange
        Allocation testAllocation = new Allocation(1234, 45);
        assertThat(testAllocation.getSize()).isEqualTo(1234);
    }

    @Test
    void testEquals(){
        EqualsVerifier.forClass(Allocation.class).verify();
    }
}
