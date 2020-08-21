package de.springboot.web;

import com.google.common.collect.ImmutableList;
import de.springboot.model.StackoverflowWebsite;
import de.springboot.service.StackOverflowService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class StackOverflowControllerTest {
    @Mock
    private StackOverflowService stackOverflowService;
    @InjectMocks
    StackOverflowController sut;

    @Test
    public void testGetListOfProviders() throws Exception {
        //prepare
        when(stackOverflowService.findAll()).thenReturn(ImmutableList.of());
        //testing
        List<StackoverflowWebsite> listOfProviders = sut.getListOfProviders();
        //validate
        verify(stackOverflowService).findAll();
    }
}