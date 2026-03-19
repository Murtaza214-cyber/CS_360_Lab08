package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City city = new City("Regina", "SK");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.deleteCity(city);

        assertFalse(list.hasCity(city));
    }

    @Test
    public void testDeleteCityThrowsException() {
        CustomList list = new CustomList();
        City city = new City("Vancouver", "BC");
        assertThrows(IllegalArgumentException.class, () -> {
            list.deleteCity(city);
        });
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        // Should be 1 after adding one city
        assertEquals(1, list.countCities());
    }

}