package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ShipTest {

    @Test
    void testEquals() {
        Position position = new Position(2,2);
        Ship ship = new Ship(position,ShipStatus.AFLOAT);
        assertTrue(ship.equals(ship));
        // TODO: Probar este metodo publico
    }
}