package org.springframework.samples.petclinic.owner;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.ModelResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;
import org.springframework.test.web.servlet.result.ViewResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

@ContextConfiguration(classes = {OwnerController.class})
@ExtendWith(SpringExtension.class)
class OwnerControllerTest {
    @Autowired
    private OwnerController ownerController;

    @MockBean
    private OwnerRepository ownerRepository;

    /**
     * Method under test: {@link OwnerController#initCreationForm(Map)}
     */
    @Test
    void testInitCreationForm() throws Exception {
        // Arrange
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/owners/new");
        StandaloneMockMvcBuilder standaloneSetupResult = MockMvcBuilders.standaloneSetup(ownerController);
        MockMvc buildResult = standaloneSetupResult.build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        StatusResultMatchers statusResult = MockMvcResultMatchers.status();
        ResultMatcher isOkResult = statusResult.isOk();
        ModelResultMatchers modelResult = MockMvcResultMatchers.model();
        ResultMatcher sizeResult = modelResult.size(1);
        ModelResultMatchers modelResult1 = MockMvcResultMatchers.model();
        ResultMatcher attributeExistsResult = modelResult1.attributeExists("owner");
        ViewResultMatchers viewResult = MockMvcResultMatchers.view();
        ResultMatcher nameResult = viewResult.name("owners/createOrUpdateOwnerForm");
        ResultMatcher forwardedUrlResult = MockMvcResultMatchers.forwardedUrl("owners/createOrUpdateOwnerForm");
        actualPerformResult.andExpect(isOkResult)
                .andExpect(sizeResult)
                .andExpect(attributeExistsResult)
                .andExpect(nameResult)
                .andExpect(forwardedUrlResult);
    }

    /**
     * Method under test: {@link OwnerController#initCreationForm(Map)}
     */
    @Test
    void testInitCreationForm2() throws Exception {
        // Arrange
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/owners/new", "Uri Vars");
        StandaloneMockMvcBuilder standaloneSetupResult = MockMvcBuilders.standaloneSetup(ownerController);
        MockMvc buildResult = standaloneSetupResult.build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        StatusResultMatchers statusResult = MockMvcResultMatchers.status();
        ResultMatcher isOkResult = statusResult.isOk();
        ModelResultMatchers modelResult = MockMvcResultMatchers.model();
        ResultMatcher sizeResult = modelResult.size(1);
        ModelResultMatchers modelResult1 = MockMvcResultMatchers.model();
        ResultMatcher attributeExistsResult = modelResult1.attributeExists("owner");
        ViewResultMatchers viewResult = MockMvcResultMatchers.view();
        ResultMatcher nameResult = viewResult.name("owners/createOrUpdateOwnerForm");
        ResultMatcher forwardedUrlResult = MockMvcResultMatchers.forwardedUrl("owners/createOrUpdateOwnerForm");
        actualPerformResult.andExpect(isOkResult)
                .andExpect(sizeResult)
                .andExpect(attributeExistsResult)
                .andExpect(nameResult)
                .andExpect(forwardedUrlResult);
    }

    /**
     * Method under test: {@link OwnerController#initFindForm(Map)}
     */
    @Test
    void testInitFindForm() throws Exception {
        // Arrange
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/owners/find");
        StandaloneMockMvcBuilder standaloneSetupResult = MockMvcBuilders.standaloneSetup(ownerController);
        MockMvc buildResult = standaloneSetupResult.build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        StatusResultMatchers statusResult = MockMvcResultMatchers.status();
        ResultMatcher isOkResult = statusResult.isOk();
        ModelResultMatchers modelResult = MockMvcResultMatchers.model();
        ResultMatcher sizeResult = modelResult.size(1);
        ModelResultMatchers modelResult1 = MockMvcResultMatchers.model();
        ResultMatcher attributeExistsResult = modelResult1.attributeExists("owner");
        ViewResultMatchers viewResult = MockMvcResultMatchers.view();
        ResultMatcher nameResult = viewResult.name("owners/findOwners");
        ResultMatcher forwardedUrlResult = MockMvcResultMatchers.forwardedUrl("owners/findOwners");
        actualPerformResult.andExpect(isOkResult)
                .andExpect(sizeResult)
                .andExpect(attributeExistsResult)
                .andExpect(nameResult)
                .andExpect(forwardedUrlResult);
    }

    /**
     * Method under test: {@link OwnerController#initFindForm(Map)}
     */
    @Test
    void testInitFindForm2() throws Exception {
        // Arrange
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/owners/find");
        getResult.characterEncoding("Encoding");
        StandaloneMockMvcBuilder standaloneSetupResult = MockMvcBuilders.standaloneSetup(ownerController);
        MockMvc buildResult = standaloneSetupResult.build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(getResult);

        // Assert
        StatusResultMatchers statusResult = MockMvcResultMatchers.status();
        ResultMatcher isOkResult = statusResult.isOk();
        ModelResultMatchers modelResult = MockMvcResultMatchers.model();
        ResultMatcher sizeResult = modelResult.size(1);
        ModelResultMatchers modelResult1 = MockMvcResultMatchers.model();
        ResultMatcher attributeExistsResult = modelResult1.attributeExists("owner");
        ViewResultMatchers viewResult = MockMvcResultMatchers.view();
        ResultMatcher nameResult = viewResult.name("owners/findOwners");
        ResultMatcher forwardedUrlResult = MockMvcResultMatchers.forwardedUrl("owners/findOwners");
        actualPerformResult.andExpect(isOkResult)
                .andExpect(sizeResult)
                .andExpect(attributeExistsResult)
                .andExpect(nameResult)
                .andExpect(forwardedUrlResult);
    }

    /**
     * Method under test: {@link OwnerController#initUpdateOwnerForm(int, Model)}
     */
    @Test
    void testInitUpdateOwnerForm() throws Exception {
        // Arrange
        Owner owner = new Owner();
        owner.setAddress("42 Main St");
        owner.setCity("Oxford");
        owner.setFirstName("Jane");
        owner.setId(1);
        owner.setLastName("Doe");
        owner.setTelephone("4105551212");
        when(ownerRepository.findById((Integer) any())).thenReturn(owner);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/owners/{ownerId}/edit", 123);
        StandaloneMockMvcBuilder standaloneSetupResult = MockMvcBuilders.standaloneSetup(ownerController);
        MockMvc buildResult = standaloneSetupResult.build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        StatusResultMatchers statusResult = MockMvcResultMatchers.status();
        ResultMatcher isOkResult = statusResult.isOk();
        ModelResultMatchers modelResult = MockMvcResultMatchers.model();
        ResultMatcher sizeResult = modelResult.size(1);
        ModelResultMatchers modelResult1 = MockMvcResultMatchers.model();
        ResultMatcher attributeExistsResult = modelResult1.attributeExists("owner");
        ViewResultMatchers viewResult = MockMvcResultMatchers.view();
        ResultMatcher nameResult = viewResult.name("owners/createOrUpdateOwnerForm");
        ResultMatcher forwardedUrlResult = MockMvcResultMatchers.forwardedUrl("owners/createOrUpdateOwnerForm");
        actualPerformResult.andExpect(isOkResult)
                .andExpect(sizeResult)
                .andExpect(attributeExistsResult)
                .andExpect(nameResult)
                .andExpect(forwardedUrlResult);
    }

    /**
     * Method under test: {@link OwnerController#processCreationForm(Owner, BindingResult)}
     */
    @Test
    void testProcessCreationForm() throws Exception {
        // Arrange
        doNothing().when(ownerRepository).save((Owner) any());
        MockHttpServletRequestBuilder postResult = MockMvcRequestBuilders.post("/owners/new");
        MockHttpServletRequestBuilder paramResult = postResult.param("address", "42 Main St");
        MockHttpServletRequestBuilder paramResult1 = paramResult.param("city", "Oxford");
        MockHttpServletRequestBuilder paramResult2 = paramResult1.param("telephone", "4105551212");
        MockHttpServletRequestBuilder paramResult3 = paramResult2.param("firstName", "Jane");
        MockHttpServletRequestBuilder requestBuilder = paramResult3.param("lastName", "Doe");
        StandaloneMockMvcBuilder standaloneSetupResult = MockMvcBuilders.standaloneSetup(ownerController);
        MockMvc buildResult = standaloneSetupResult.build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        StatusResultMatchers statusResult = MockMvcResultMatchers.status();
        ResultMatcher isFoundResult = statusResult.isFound();
        ModelResultMatchers modelResult = MockMvcResultMatchers.model();
        ResultMatcher sizeResult = modelResult.size(1);
        ModelResultMatchers modelResult1 = MockMvcResultMatchers.model();
        ResultMatcher attributeExistsResult = modelResult1.attributeExists("owner");
        ViewResultMatchers viewResult = MockMvcResultMatchers.view();
        ResultMatcher nameResult = viewResult.name("redirect:/owners/null");
        ResultMatcher redirectedUrlResult = MockMvcResultMatchers.redirectedUrl("/owners/null");
        actualPerformResult.andExpect(isFoundResult)
                .andExpect(sizeResult)
                .andExpect(attributeExistsResult)
                .andExpect(nameResult)
                .andExpect(redirectedUrlResult);
    }

    /**
     * Method under test: {@link OwnerController#processCreationForm(Owner, BindingResult)}
     */
    @Test
    void testProcessCreationForm2() throws Exception {
        // Arrange
        doNothing().when(ownerRepository).save((Owner) any());
        MockHttpServletRequestBuilder postResult = MockMvcRequestBuilders.post("/owners/new");
        MockHttpServletRequestBuilder paramResult = postResult.param("address", "");
        MockHttpServletRequestBuilder paramResult1 = paramResult.param("city", "Oxford");
        MockHttpServletRequestBuilder paramResult2 = paramResult1.param("telephone", "4105551212");
        MockHttpServletRequestBuilder paramResult3 = paramResult2.param("firstName", "Jane");
        MockHttpServletRequestBuilder requestBuilder = paramResult3.param("lastName", "Doe");
        StandaloneMockMvcBuilder standaloneSetupResult = MockMvcBuilders.standaloneSetup(ownerController);
        MockMvc buildResult = standaloneSetupResult.build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        StatusResultMatchers statusResult = MockMvcResultMatchers.status();
        ResultMatcher isOkResult = statusResult.isOk();
        ModelResultMatchers modelResult = MockMvcResultMatchers.model();
        ResultMatcher sizeResult = modelResult.size(1);
        ModelResultMatchers modelResult1 = MockMvcResultMatchers.model();
        ResultMatcher attributeExistsResult = modelResult1.attributeExists("owner");
        ViewResultMatchers viewResult = MockMvcResultMatchers.view();
        ResultMatcher nameResult = viewResult.name("owners/createOrUpdateOwnerForm");
        ResultMatcher forwardedUrlResult = MockMvcResultMatchers.forwardedUrl("owners/createOrUpdateOwnerForm");
        actualPerformResult.andExpect(isOkResult)
                .andExpect(sizeResult)
                .andExpect(attributeExistsResult)
                .andExpect(nameResult)
                .andExpect(forwardedUrlResult);
    }

    /**
     * Method under test: {@link OwnerController#processFindForm(int, Owner, BindingResult, Model)}
     */
    @Test
    void testProcessFindForm() throws Exception {
        // Arrange
        when(ownerRepository.findByLastName((String) any(), (Pageable) any()))
                .thenReturn(new PageImpl<>(new ArrayList<>()));
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/owners");
        String valueOfResult = String.valueOf(1);
        MockHttpServletRequestBuilder requestBuilder = getResult.param("page", valueOfResult);
        StandaloneMockMvcBuilder standaloneSetupResult = MockMvcBuilders.standaloneSetup(ownerController);
        MockMvc buildResult = standaloneSetupResult.build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        StatusResultMatchers statusResult = MockMvcResultMatchers.status();
        ResultMatcher isOkResult = statusResult.isOk();
        ModelResultMatchers modelResult = MockMvcResultMatchers.model();
        ResultMatcher sizeResult = modelResult.size(1);
        ModelResultMatchers modelResult1 = MockMvcResultMatchers.model();
        ResultMatcher attributeExistsResult = modelResult1.attributeExists("owner");
        ViewResultMatchers viewResult = MockMvcResultMatchers.view();
        ResultMatcher nameResult = viewResult.name("owners/findOwners");
        ResultMatcher forwardedUrlResult = MockMvcResultMatchers.forwardedUrl("owners/findOwners");
        actualPerformResult.andExpect(isOkResult)
                .andExpect(sizeResult)
                .andExpect(attributeExistsResult)
                .andExpect(nameResult)
                .andExpect(forwardedUrlResult);
    }

    /**
     * Method under test: {@link OwnerController#processFindForm(int, Owner, BindingResult, Model)}
     */
    @Test
    void testProcessFindForm2() throws Exception {
        // Arrange
        Owner owner = new Owner();
        owner.setAddress("42 Main St");
        owner.setCity("Oxford");
        owner.setFirstName("Jane");
        owner.setId(1);
        owner.setLastName("Doe");
        owner.setTelephone("4105551212");

        ArrayList<Owner> ownerList = new ArrayList<>();
        ownerList.add(owner);
        PageImpl<Owner> pageImpl = new PageImpl<>(ownerList);
        when(ownerRepository.findByLastName((String) any(), (Pageable) any())).thenReturn(pageImpl);
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/owners");
        String valueOfResult = String.valueOf(1);
        MockHttpServletRequestBuilder requestBuilder = getResult.param("page", valueOfResult);
        StandaloneMockMvcBuilder standaloneSetupResult = MockMvcBuilders.standaloneSetup(ownerController);
        MockMvc buildResult = standaloneSetupResult.build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        StatusResultMatchers statusResult = MockMvcResultMatchers.status();
        ResultMatcher isFoundResult = statusResult.isFound();
        ModelResultMatchers modelResult = MockMvcResultMatchers.model();
        ResultMatcher sizeResult = modelResult.size(1);
        ModelResultMatchers modelResult1 = MockMvcResultMatchers.model();
        ResultMatcher attributeExistsResult = modelResult1.attributeExists("owner");
        ViewResultMatchers viewResult = MockMvcResultMatchers.view();
        ResultMatcher nameResult = viewResult.name("redirect:/owners/1");
        ResultMatcher redirectedUrlResult = MockMvcResultMatchers.redirectedUrl("/owners/1");
        actualPerformResult.andExpect(isFoundResult)
                .andExpect(sizeResult)
                .andExpect(attributeExistsResult)
                .andExpect(nameResult)
                .andExpect(redirectedUrlResult);
    }

    /**
     * Method under test: {@link OwnerController#processFindForm(int, Owner, BindingResult, Model)}
     */
    @Test
    void testProcessFindForm3() throws Exception {
        // Arrange
        Owner owner = new Owner();
        owner.setAddress("42 Main St");
        owner.setCity("Oxford");
        owner.setFirstName("Jane");
        owner.setId(1);
        owner.setLastName("Doe");
        owner.setTelephone("4105551212");

        Owner owner1 = new Owner();
        owner1.setAddress("42 Main St");
        owner1.setCity("Oxford");
        owner1.setFirstName("Jane");
        owner1.setId(1);
        owner1.setLastName("Doe");
        owner1.setTelephone("4105551212");

        ArrayList<Owner> ownerList = new ArrayList<>();
        ownerList.add(owner1);
        ownerList.add(owner);
        PageImpl<Owner> pageImpl = new PageImpl<>(ownerList);
        when(ownerRepository.findByLastName((String) any(), (Pageable) any())).thenReturn(pageImpl);
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/owners");
        String valueOfResult = String.valueOf(1);
        MockHttpServletRequestBuilder requestBuilder = getResult.param("page", valueOfResult);
        StandaloneMockMvcBuilder standaloneSetupResult = MockMvcBuilders.standaloneSetup(ownerController);
        MockMvc buildResult = standaloneSetupResult.build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        StatusResultMatchers statusResult = MockMvcResultMatchers.status();
        ResultMatcher isOkResult = statusResult.isOk();
        ModelResultMatchers modelResult = MockMvcResultMatchers.model();
        ResultMatcher sizeResult = modelResult.size(5);
        ModelResultMatchers modelResult1 = MockMvcResultMatchers.model();
        ResultMatcher attributeExistsResult = modelResult1.attributeExists("currentPage", "listOwners", "owner",
                "totalItems", "totalPages");
        ViewResultMatchers viewResult = MockMvcResultMatchers.view();
        ResultMatcher nameResult = viewResult.name("owners/ownersList");
        ResultMatcher forwardedUrlResult = MockMvcResultMatchers.forwardedUrl("owners/ownersList");
        actualPerformResult.andExpect(isOkResult)
                .andExpect(sizeResult)
                .andExpect(attributeExistsResult)
                .andExpect(nameResult)
                .andExpect(forwardedUrlResult);
    }

    /**
     * Method under test: {@link OwnerController#processFindForm(int, Owner, BindingResult, Model)}
     */
    @Test
    void testProcessFindForm4() throws Exception {
        // Arrange
        when(ownerRepository.findByLastName((String) any(), (Pageable) any()))
                .thenReturn(new PageImpl<>(new ArrayList<>()));
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/owners");
        String valueOfResult = String.valueOf(1);
        MockHttpServletRequestBuilder paramResult = getResult.param("page", valueOfResult);
        MockHttpServletRequestBuilder requestBuilder = paramResult.param("lastName", "Doe");
        StandaloneMockMvcBuilder standaloneSetupResult = MockMvcBuilders.standaloneSetup(ownerController);
        MockMvc buildResult = standaloneSetupResult.build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        StatusResultMatchers statusResult = MockMvcResultMatchers.status();
        ResultMatcher isOkResult = statusResult.isOk();
        ModelResultMatchers modelResult = MockMvcResultMatchers.model();
        ResultMatcher sizeResult = modelResult.size(1);
        ModelResultMatchers modelResult1 = MockMvcResultMatchers.model();
        ResultMatcher attributeExistsResult = modelResult1.attributeExists("owner");
        ViewResultMatchers viewResult = MockMvcResultMatchers.view();
        ResultMatcher nameResult = viewResult.name("owners/findOwners");
        ResultMatcher forwardedUrlResult = MockMvcResultMatchers.forwardedUrl("owners/findOwners");
        actualPerformResult.andExpect(isOkResult)
                .andExpect(sizeResult)
                .andExpect(attributeExistsResult)
                .andExpect(nameResult)
                .andExpect(forwardedUrlResult);
    }

    /**
     * Method under test: {@link OwnerController#processUpdateOwnerForm(Owner, BindingResult, int)}
     */
    @Test
    void testProcessUpdateOwnerForm() throws Exception {
        // Arrange
        doNothing().when(ownerRepository).save((Owner) any());
        MockHttpServletRequestBuilder postResult = MockMvcRequestBuilders.post("/owners/{ownerId}/edit", 123);
        MockHttpServletRequestBuilder paramResult = postResult.param("address", "42 Main St");
        MockHttpServletRequestBuilder paramResult1 = paramResult.param("city", "Oxford");
        MockHttpServletRequestBuilder paramResult2 = paramResult1.param("telephone", "4105551212");
        MockHttpServletRequestBuilder paramResult3 = paramResult2.param("firstName", "Jane");
        MockHttpServletRequestBuilder requestBuilder = paramResult3.param("lastName", "Doe");
        StandaloneMockMvcBuilder standaloneSetupResult = MockMvcBuilders.standaloneSetup(ownerController);
        MockMvc buildResult = standaloneSetupResult.build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        StatusResultMatchers statusResult = MockMvcResultMatchers.status();
        ResultMatcher isFoundResult = statusResult.isFound();
        ModelResultMatchers modelResult = MockMvcResultMatchers.model();
        ResultMatcher sizeResult = modelResult.size(1);
        ModelResultMatchers modelResult1 = MockMvcResultMatchers.model();
        ResultMatcher attributeExistsResult = modelResult1.attributeExists("owner");
        ViewResultMatchers viewResult = MockMvcResultMatchers.view();
        ResultMatcher nameResult = viewResult.name("redirect:/owners/{ownerId}");
        ResultMatcher redirectedUrlResult = MockMvcResultMatchers.redirectedUrl("/owners/123");
        actualPerformResult.andExpect(isFoundResult)
                .andExpect(sizeResult)
                .andExpect(attributeExistsResult)
                .andExpect(nameResult)
                .andExpect(redirectedUrlResult);
    }

    /**
     * Method under test: {@link OwnerController#processUpdateOwnerForm(Owner, BindingResult, int)}
     */
    @Test
    void testProcessUpdateOwnerForm2() throws Exception {
        // Arrange
        doNothing().when(ownerRepository).save((Owner) any());
        MockHttpServletRequestBuilder postResult = MockMvcRequestBuilders.post("/owners/{ownerId}/edit", 123);
        MockHttpServletRequestBuilder paramResult = postResult.param("address", "");
        MockHttpServletRequestBuilder paramResult1 = paramResult.param("city", "Oxford");
        MockHttpServletRequestBuilder paramResult2 = paramResult1.param("telephone", "4105551212");
        MockHttpServletRequestBuilder paramResult3 = paramResult2.param("firstName", "Jane");
        MockHttpServletRequestBuilder requestBuilder = paramResult3.param("lastName", "Doe");
        StandaloneMockMvcBuilder standaloneSetupResult = MockMvcBuilders.standaloneSetup(ownerController);
        MockMvc buildResult = standaloneSetupResult.build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        StatusResultMatchers statusResult = MockMvcResultMatchers.status();
        ResultMatcher isOkResult = statusResult.isOk();
        ModelResultMatchers modelResult = MockMvcResultMatchers.model();
        ResultMatcher sizeResult = modelResult.size(1);
        ModelResultMatchers modelResult1 = MockMvcResultMatchers.model();
        ResultMatcher attributeExistsResult = modelResult1.attributeExists("owner");
        ViewResultMatchers viewResult = MockMvcResultMatchers.view();
        ResultMatcher nameResult = viewResult.name("owners/createOrUpdateOwnerForm");
        ResultMatcher forwardedUrlResult = MockMvcResultMatchers.forwardedUrl("owners/createOrUpdateOwnerForm");
        actualPerformResult.andExpect(isOkResult)
                .andExpect(sizeResult)
                .andExpect(attributeExistsResult)
                .andExpect(nameResult)
                .andExpect(forwardedUrlResult);
    }

    /**
     * Method under test: {@link OwnerController#showOwner(int)}
     */
    @Test
    void testShowOwner() throws Exception {
        // Arrange
        Owner owner = new Owner();
        owner.setAddress("42 Main St");
        owner.setCity("Oxford");
        owner.setFirstName("Jane");
        owner.setId(1);
        owner.setLastName("Doe");
        owner.setTelephone("4105551212");
        when(ownerRepository.findById((Integer) any())).thenReturn(owner);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/owners/{ownerId}", 123);
        StandaloneMockMvcBuilder standaloneSetupResult = MockMvcBuilders.standaloneSetup(ownerController);
        MockMvc buildResult = standaloneSetupResult.build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        StatusResultMatchers statusResult = MockMvcResultMatchers.status();
        ResultMatcher isOkResult = statusResult.isOk();
        ModelResultMatchers modelResult = MockMvcResultMatchers.model();
        ResultMatcher sizeResult = modelResult.size(1);
        ModelResultMatchers modelResult1 = MockMvcResultMatchers.model();
        ResultMatcher attributeExistsResult = modelResult1.attributeExists("owner");
        ViewResultMatchers viewResult = MockMvcResultMatchers.view();
        ResultMatcher nameResult = viewResult.name("owners/ownerDetails");
        ResultMatcher forwardedUrlResult = MockMvcResultMatchers.forwardedUrl("owners/ownerDetails");
        actualPerformResult.andExpect(isOkResult)
                .andExpect(sizeResult)
                .andExpect(attributeExistsResult)
                .andExpect(nameResult)
                .andExpect(forwardedUrlResult);
    }
}

