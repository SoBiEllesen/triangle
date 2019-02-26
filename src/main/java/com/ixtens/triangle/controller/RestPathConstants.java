package com.ixtens.triangle.controller;

public interface RestPathConstants {
    String EXTERNAL_PREFIX = "/rest/external";
    String STOREFRONT_V0 = "storefront/v0";
    String STOREFRONT_URL = EXTERNAL_PREFIX + "/" + STOREFRONT_V0;
    String STOREFRONT_V1 = "storefront/v1";
    String STOREFRONT_URL_V1 = EXTERNAL_PREFIX + "/" + STOREFRONT_V1;
    String STOREFRONT_V1_SWAGGER = "storefront-v1";
    String BUYER_V0 = "buyer/v0";
    String BUYER_URL_V0 = EXTERNAL_PREFIX + "/" + BUYER_V0;
    String BUYER_V1 = "buyer/v1";
    String BUYER_URL_V1 = EXTERNAL_PREFIX + "/" + BUYER_V1;
    String SWAGGER_BUYER_V1 = "buyer-v1-";
}
