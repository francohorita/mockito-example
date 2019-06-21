package com.example.mockitoexample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationsTest {
    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl someBusiness;

    @Test
    public void findTheGreatestFromAllDataTest(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});

        assertEquals(24, someBusiness.findTheGreatestFromAllData());
    }

    @Test
    public void findTheGreatestFromAllDataForOneValueTest(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});

        assertEquals(15, someBusiness.findTheGreatestFromAllData());
    }

    @Test
    public void findTheGreatestFromAllDataNoValueTest(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});

        assertEquals(Integer.MIN_VALUE, someBusiness.findTheGreatestFromAllData());
    }
}