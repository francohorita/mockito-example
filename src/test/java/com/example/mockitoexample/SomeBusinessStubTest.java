package com.example.mockitoexample;

import org.junit.Test;
import static org.junit.Assert.*;

public class SomeBusinessStubTest {
    @Test
    public void findTheGreatestFromAllDataTest(){
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStub());
        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(24, result);
    }
}

class DataServiceStub implements DataService{

    @Override
    public int[] retrieveAllData() {
        return new int[] {24,6,15};
    }
}