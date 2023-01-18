package com.gfs.gordonnow.externaltestingdemo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class SomeEndpointTestService {

    @PostConstruct
    public void runTests() {
        // TBD -- using the generated library of one's choice, assuming java in this example, simply
        // use that client API to make the calls. Here is a Delivery ETA sample:

        /*

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        // Configure HTTP bearer authorization: customer-user-jwt-auth
        HttpBearerAuth customer-user-jwt-auth = (HttpBearerAuth) defaultClient.getAuthentication("customer-user-jwt-auth");
        customer-user-jwt-auth.setBearerToken("BEARER TOKEN");

        DeliveryEtasApi apiInstance = new DeliveryEtasApi(defaultClient);
        String customerNumber = "customerNumber_example"; // String | SAP customer number or a legacy customer unit key in one of the described formats
        OffsetDateTime deliveryEpoch = OffsetDateTime.now(); // OffsetDateTime | Start time of the delivery ETA window
        String salesOrganization = "salesOrganization_example"; // String | SAP sales organization (1000 = US, 2XXX = US Specialty Companies,        3000 = Canada, 4XXX = CA Specialty Companies)
        String distributionChannel = "distributionChannel_example"; // String | SAP distribution channel; always '10' except for United Restaurant Supplies        in Canada, where it is '20'
        String division = "division_example"; // String | SAP division; always '10'
        String userGuid = "userGuid_example"; // String | User under which to perform the operation. Omit to use the currently authenticated user.        If provided, the current user must have delegated permission to act on behalf of the        given user. (NOT YET SUPPORTED)

        try {
            DetailedDeliveryEtaDto result = apiInstance.get2(customerNumber, deliveryEpoch, salesOrganization, distributionChannel, division, userGuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryEtasApi#get2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }

         */
    }
}
