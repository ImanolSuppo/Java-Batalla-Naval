package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class BattleShipGameTest {

    @Test
    void testValidateSunkenFleet() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        BattleShipGame battleShipGame = new BattleShipGame();
        Method metodoPrivado = BattleShipGame.class.getDeclaredMethod("isValidPositionInput", String.class);
        metodoPrivado.setAccessible(true);
        assertTrue((Boolean) metodoPrivado.invoke(battleShipGame, "1 9"));
        // TODO: Probar este metodo privado
    }

}