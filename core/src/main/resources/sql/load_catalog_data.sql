--
-- The Archetype is configured with "hibernate.hbm2ddl.auto" value="create-drop" in "persistence.xml".
--
-- This will cause hibernate to populate the database when the application is started by processing the files that
-- were configured in the hibernate.hbm2ddl.import_files property.
--
-- This file is responsible for loading the the catalog data used in the Archetype.   Implementers can change this file
-- to load their initial catalog.
--

-- BLC Admin Required Categories


-- Custom store navigation (default template uses these for the header navigation)


-- Builds the category hierarchy (simple in this case) - Root --> Nav --> All other categories


-- Add in any applicable search facets for the given category
INSERT INTO BLC_FIELD (FIELD_ID, ENTITY_TYPE, PROPERTY_NAME, ABBREVIATION, SEARCHABLE, FACET_FIELD_TYPE) VALUES (1, 'PRODUCT', 'manufacturer', 'mfg', TRUE, 's');
INSERT INTO BLC_FIELD (FIELD_ID, ENTITY_TYPE, PROPERTY_NAME, ABBREVIATION, SEARCHABLE, FACET_FIELD_TYPE) VALUES (2, 'PRODUCT', 'defaultSku.retailPrice', 'price', TRUE, 'p');
INSERT INTO BLC_FIELD (FIELD_ID, ENTITY_TYPE, PROPERTY_NAME, ABBREVIATION, SEARCHABLE, TRANSLATABLE, FACET_FIELD_TYPE) VALUES (3, 'PRODUCT', 'defaultSku.name', 'name', TRUE, TRUE, 's');
INSERT INTO BLC_FIELD (FIELD_ID, ENTITY_TYPE, PROPERTY_NAME, ABBREVIATION, SEARCHABLE, FACET_FIELD_TYPE) VALUES (4, 'PRODUCT', 'model', 'model', TRUE, 's');
INSERT INTO BLC_FIELD (FIELD_ID, ENTITY_TYPE, PROPERTY_NAME, ABBREVIATION, SEARCHABLE, TRANSLATABLE) VALUES (5, 'PRODUCT', 'defaultSku.description', 'desc', TRUE, TRUE);
INSERT INTO BLC_FIELD (FIELD_ID, ENTITY_TYPE, PROPERTY_NAME, ABBREVIATION, SEARCHABLE, TRANSLATABLE) VALUES (6, 'PRODUCT', 'defaultSku.longDescription', 'ldesc', TRUE, TRUE);
INSERT INTO BLC_FIELD (FIELD_ID, ENTITY_TYPE, PROPERTY_NAME, ABBREVIATION, SEARCHABLE, FACET_FIELD_TYPE) VALUES (7, 'PRODUCT', 'defaultCategory.name', 'categoryName', TRUE, 's');

INSERT INTO BLC_FIELD_SEARCH_TYPES (FIELD_ID, SEARCHABLE_FIELD_TYPE) VALUES (1, 't');
INSERT INTO BLC_FIELD_SEARCH_TYPES (FIELD_ID, SEARCHABLE_FIELD_TYPE) VALUES (2, 't');
INSERT INTO BLC_FIELD_SEARCH_TYPES (FIELD_ID, SEARCHABLE_FIELD_TYPE) VALUES (3, 't');
INSERT INTO BLC_FIELD_SEARCH_TYPES (FIELD_ID, SEARCHABLE_FIELD_TYPE) VALUES (4, 't');
INSERT INTO BLC_FIELD_SEARCH_TYPES (FIELD_ID, SEARCHABLE_FIELD_TYPE) VALUES (5, 't');
INSERT INTO BLC_FIELD_SEARCH_TYPES (FIELD_ID, SEARCHABLE_FIELD_TYPE) VALUES (6, 't');
INSERT INTO BLC_FIELD_SEARCH_TYPES (FIELD_ID, SEARCHABLE_FIELD_TYPE) VALUES (7, 't');

INSERT INTO BLC_SEARCH_FACET (SEARCH_FACET_ID, FIELD_ID, LABEL, SHOW_ON_SEARCH, MULTISELECT, SEARCH_DISPLAY_PRIORITY) VALUES (1, 1, 'Manufacturer', FALSE, TRUE, 1);
INSERT INTO BLC_SEARCH_FACET (SEARCH_FACET_ID, FIELD_ID, LABEL, SHOW_ON_SEARCH, MULTISELECT, SEARCH_DISPLAY_PRIORITY) VALUES (2, 2, 'Price', FALSE, TRUE, 1);
INSERT INTO BLC_SEARCH_FACET (SEARCH_FACET_ID, FIELD_ID, LABEL, SHOW_ON_SEARCH, MULTISELECT, SEARCH_DISPLAY_PRIORITY) VALUES (3, 7, 'categoryName', FALSE, TRUE, 1);

------------------------------------------------------------------------------------------------------------------
-- Inserting products manually involves five steps which are outlined below.   Typically, products are loaded 
-- up front in the project and then managed via the Broadleaf Commerce admin.   
--
-- Loading through this script is a convenient way to get started when prototyping and can be useful in development
-- as a way to share data-setup without requiring a shared DB connection. 
------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------------------------
-- Load Catalog - Step 1:  Create the products
-- =============================================
-- In this step, we are also populating the manufacturer for the product
------------------------------------------------------------------------------------------------------------------


-- Merchandise (products with options)


-- Bundles



------------------------------------------------------------------------------------------------------------------
-- Load Catalog - Step 2:  Create "default" SKUs
-- =============================================
-- The Broadleaf Commerce product model is setup such that every product has a default SKU.   For many products,
-- a product only has one SKU.    SKUs hold the pricing information for the product and are the actual entity
-- that is added to the cart.    Inventory, Pricing, and Fulfillment concerns are done at the SKU level
------------------------------------------------------------------------------------------------------------------


--bundle1 Skus


---bundle2 Skus


------------------------------------------------------------------------------------------------------------------
-- Give some of the SKUs a sale price
------------------------------------------------------------------------------------------------------------------


------------------------------------------------------------------------------------------------------------------
-- Some SKUs (such as merchandise) may be product options based on one product. For example, there may be a 
-- "Men's Hand drawn Heat Clinic Shirt" product that has up to 12 SKUs showing the options of 
-- Red/Black/Silver, and Small/Medium/Large/X-Large
------------------------------------------------------------------------------------------------------------------


------------------------------------------------------------------------------------------------------------------
-- Update the DEFAULT_SKU_ID on the products
------------------------------------------------------------------------------------------------------------------


------------------------------------------------------------------------------------------------------------------
-- Create non-default SKUs for some merchandise. In this case, we're stating that all XL shirts are $1.00 more
-- All other combinations have no special properties, but we must create them so we can track inventory on a 
-- per-SKU level. Generally, either you have only a default SKU or SKUs for all permutations of product options
------------------------------------------------------------------------------------------------------------------


------------------------------------------------------------------------------------------------------------------
-- Associate the appropriate option values for the skus
------------------------------------------------------------------------------------------------------------------




------------------------------------------------------------------------------------------------------------------
-- Add some heat levels to all the products
------------------------------------------------------------------------------------------------------------------



------------------------------------------------------------------------------------------------------------------
-- Link the non-default SKUs for merchandise
------------------------------------------------------------------------------------------------------------------


------------------------------------------------------------------------------------------------------------------
-- Associate the merchandise products with their appropriate available product options
------------------------------------------------------------------------------------------------------------------


------------------------------------------------------------------------------------------------------------------
-- Load Catalog - Step 3:  Create Category/Product Mapping
-- ========================================================
-- Add all hot-sauce items to the hot-sauce category
------------------------------------------------------------------------------------------------------------------


-- home page items


-- clearance items


-- merchandise items


------------------------------------------------------------------------------------------------------------------
-- Load Catalog - Step 4:  Media Items used by products
-- ========================================================
------------------------------------------------------------------------------------------------------------------



------------------------------------------------------------------------------------------------------------------
-- Load Catalog - Step 5:  Mapping for product to media
-- ========================================================
------------------------------------------------------------------------------------------------------------------


------------------------------------------------------------------------------------------------------------------
-- Load Catalog - Step 5: Asset Items (media)
-- ========================================================
------------------------------------------------------------------------------------------------------------------




------------------------------------------------------------------------------------------------------------------
-- End of Catalog load
-- ========================================================
------------------------------------------------------------------------------------------------------------------


-----------------------------------------------
-----------------------------------------------------------------------------------------------------------------------------------
-- RELATED PRODUCT - DATA (featured products for right-hand side display)
-----------------------------------------------------------------------------------------------------------------------------------
-- Adding to root category


-- Adding to merchandise category


-- Adding to hot-sauces category


-- Adding a 20% off sale to Merchandise category to fit the Shirts Special Homepage Banner


-- adding some default tax codes
INSERT INTO BLC_DATA_DRVN_ENUM (ENUM_ID, ENUM_KEY, MODIFIABLE) VALUES (1, 'TAX_CODE', FALSE);
INSERT INTO BLC_DATA_DRVN_ENUM_VAL (ENUM_VAL_ID, DISPLAY, HIDDEN, ENUM_KEY, ENUM_TYPE) VALUES (1, '0.85', FALSE, 'code1', 1);
INSERT INTO BLC_DATA_DRVN_ENUM_VAL (ENUM_VAL_ID, DISPLAY, HIDDEN, ENUM_KEY, ENUM_TYPE) VALUES (2, '0.80', FALSE, 'code2', 1);



-- Sample fulfillment option
INSERT INTO BLC_FULFILLMENT_OPTION (FULFILLMENT_OPTION_ID, NAME, LONG_DESCRIPTION, USE_FLAT_RATES, FULFILLMENT_TYPE) VALUES (1, 'Standard', '5 - 7 Days', FALSE, 'PHYSICAL_SHIP');
INSERT INTO BLC_FULFILLMENT_OPTION (FULFILLMENT_OPTION_ID, NAME, LONG_DESCRIPTION, USE_FLAT_RATES, FULFILLMENT_TYPE) VALUES (2, 'Priority', '3 - 5 Days', FALSE, 'PHYSICAL_SHIP');
INSERT INTO BLC_FULFILLMENT_OPTION (FULFILLMENT_OPTION_ID, NAME, LONG_DESCRIPTION, USE_FLAT_RATES, FULFILLMENT_TYPE) VALUES (3, 'Express', '1 - 2 Days', FALSE, 'PHYSICAL_SHIP');

INSERT INTO BLC_FULFILLMENT_OPTION_FIXED (FULFILLMENT_OPTION_ID, PRICE) VALUES (1, 5.00);
INSERT INTO BLC_FULFILLMENT_OPTION_FIXED (FULFILLMENT_OPTION_ID, PRICE) VALUES (2, 10.00);
INSERT INTO BLC_FULFILLMENT_OPTION_FIXED (FULFILLMENT_OPTION_ID, PRICE) VALUES (3, 20.00);
