# Katalon Studio

Katalon Studio is a smart, robust, and scalable automation solution built for both beginners and expert testers everywhere. Katalon Studio revolutionizes the use of open-source test automation frameworks such as Selenium and Appium by eliminating their technical complexities. This revolution allows developers and QAs to set up, create, run, report, and manage their automated tests for Web, Mobile, and API Testings efficiently. Starting from [Katalon Studio 7.0](https://docs.katalon.com/katalon-studio/new/version-70.html), Desktop App Testing built upon WinAppDrivers (written and maintained by Microsoft) is available for users to create automated tests for Windows Desktop Applications.

The latest official release can be downloaded from Katalon [website](https://www.katalon.com/download/). For older versions of Katalon Studio, you can download from [GitHub Releases](https://github.com/katalon-studio/katalon-studio/releases) page.

## Description

This test will test three scenario with header and footer, for https://www.cleanersupply.com/ website

## Test Plan

# Header Test Plan :

- Clicking on each menu nav item and verify the title and redirect to the correct page(URL) and page heading (navbar-right ,navbar-left ) 
- Hovering over all menu items (check the design and dropdown menus)
- verify clicking on Page logo
- Verify search Field icon + placeholder
- verify that placeholder disappear when focus on the search field
- verify header images (2 images) logo  url and alt text
- Verify clicking and hovering over details link
- verify that the ads title is exist “FREE SHIPPING & RETURNS ON ORDERS OVER $99”
- verify clicking and hovering over Customer Service link
- verify that the customer service number in displayed correctly
- verify that customer service number is reflect in the footer
- verify when the cart is empty the message “YOUR CART IS EMPTY AND VERY SAD” will displayed (image url and alt)
- verify if the cart is not empty then the menu list will equal the number on the badge.

# Scenario 1 Test Plan :

- verify when typing in search field  the placeHolder will disappear suggestions dropdown will be displayed
- check that the dropdown contains Search for PLASTIC
- check suggestions containing plastic keywords in categories and products section.
- Verify the loading result in categories and products section when typing 
- verify pressing enter after typing in search field:
- verify URL , title , heading
- verify that search result contains plastic
- verify that the url contains query for plastic
-  verify the number of the results equal 224
- verify that the number of results require 10 pages

- verify Select 'Packing Products' filter
- verify the loading page is visible
- verify the url changed Category=Packaging+Products
- verify that the option selected 
- verify that the design of selected option changed
- verify the number of filter products reflected on the results header
- verify that the number of results require 3 pages
- verify the number of results
- verify selected filter 

-  verify selecting  'Plastic Bags' option
- verify the loading page is visible
- wait until loading page hidden
- verify the url changed Category=Packaging+Products_Plastic+Bags
- verify that the option selected 
- verify that the design of selected option changed
- verify the number of filter products reflected on the results header = the sum of all categories filters.
- verify that the number of results require 3 pages
- verify the number of list results
- verify selected filter 

- verify Selecting green color:
- verify the color group card is opened
- verify the color icon change to minus (-) when open
- verify colors list contains green Color
- verify that the green image url contains green word in the href
- verify Clicking on green List item:
- verify the loading page is displayed
- verify that the green color item is selected(black border)
- verify selected filter 
- verify the number of  list results
- verify the number of filter products reflected and equal 1
- verify the url changed Color+Group=Green
- verify hovering over product
- verify hovering over view details button
- verify clicking on product:
- ​	-verify breadcrumb is displayed and contains one of name filters
- ​	- verify url and title contains product name
- verify the product details:
- ​	-verify product pack number in title matched
- ​	-verify product description contains product name
- ​	-verify  Q&As Write a Review is clickable
- ​	-verify read more is clickable
- ​	-verify product price in the same range of product price
- ​	-verify product list in the same of product list details
- ​	-verify color contains green color
- ​	-verify color available is matched to color list number (Available in 5 colors)
- ​	-verify product image is matched 
- ​	-verify size selected is x-small by default and the product title have same size
- -verify first color is selected by default
- -verify price in volume pricing table matched product price
- -verify the calculated product discount calculated correct depends on product Qty
- Verify description more section header details:
- ​	-verify the product name in product description and product description text

- Verify product description specification section:
- ​		UNITS, MATERIAL, SIZE / DIMENSION
- Verify the questions and answers numbers in product description is matched in Q/A section 
- ​	Verify Select 'X-Large' size:
- ​		-Verify the URL
- ​		-Verify the price
- ​		-Verify the list price
- ​		-Verify 'X-Large' size selected is reflected on design
- ​		-Verify volume pricing table change
- ​		-Verify SIZE / DIMENSION description specification section is changed
- Verify clicking on green color:
- ​		-Verify the URL
- ​		-Verify green color selected (black border)
- ​	-Verify change the selected-color-text is green
- ​	-Verify the product in stock
- ​	-Verify the selected quantity is one by default
- ​	-Verify the image changed
- Verify Editing quantity value to be 5 and the value reflected
- Verify Hovering on Add to Cart button
- Verify Clicking on Add to Cart button:
- ​	-Verify display loading word in the button and change the text to added to cart
- ​	-Verify the price in the cart is calculated correctly based on discount
- ​	-Verify the product cart number increased 
- ​	Verify hovering on cart icon:
- -Verify product name 
- -Verify product quantity 
- -Verify total price of items
- -Verify the stock id 
- -Verify product item price
- -Verify sub-total price
- -Verify subtotal item
- -Verify the image 
- Verify Selecting blue color:
- -Verify the URL
- ​		-Verify blue color selected (black border)
- ​	-Verify change the selected-color-text is blue 
- ​	-Verify the product in stock
- ​	-Verify the selected quantity is one by default
- ​	-Verify the image changed
- Verify Select 'Large' size:
- ​		-Verify the URL
- ​		-Verify the title
- ​		-Verify the price
- ​		-Verify the list price
- ​		-Verify 'Large' size selected is reflected on design
- ​		-Verify volume pricing table change
- ​		-Verify SIZE / DIMENSION description specification section is changed
- Verify Editing quantity value to be 3 and the value reflected
- Verify Hovering on Add to Cart button
- Verify Clicking on Add to Cart button:
- -Verify display loading word in the button and change the text to added to cart
- -Verify the price in the cart is calculated correctly based on discount
- -Verify the product cart number increased
- -Verify the quantity back to 1
- -Verify the price changed 
- -Verify hovering on cart icon:
- -Verify product name 
- -Verify product quantity 
- -Verify total price of items
- -Verify the stock id 
- -Verify product item price
- -Verify sub-total price
- -Verify subtotal item
- -Verify the image 

- Verify clicking on the cart icon
- -Verify URL , title , heading
- -Verify the image product is reflected in shopping cart
- -Verify the product name is reflected in shopping cart
- -Verify the product ID is reflected in shopping cart
- -Verify the product in Stock is reflected in shopping cart
- -Verify QUANTITY for each item is reflected 
- -Verify the product price is reflected in shopping cart
- -Verify the product total is reflected in shopping cart
- -Verify ORDER SUMMARY details:
- ​	-Verify SUBTOTAL of  ITEMS
- -Verify SUBTOTAL of  price
- -Verify the total price

- Verify product quantities to be 4 for the first item.
- ​	-Verify product total
- ​	-Verify the TOTAL in ORDER SUMMARY
- -Verify the SUBTOTAL in ORDER SUMMARY



- Verify product quantities to be 4 for the second item. 
- ​	-Verify product total
- ​	-Verify the TOTAL in ORDER SUMMARY
- -Verify the SUBTOTAL in ORDER SUMMARY
- Verify Hovering on 'Proceed To Checkout'.
- Verify Clicking on 'Proceed To Checkout'.
- ​	-Verify URL , title 
- ​	-Verify Secure Checkout in heading
- ​	-Verify Checkout as a guest or register is selected by default
- -Verify Order total is reflected 
- -Verify the image product is reflected in shopping cart
- -Verify the product name is reflected in shopping cart
- -Verify the product ID is reflected in shopping cart
- -Verify the product in Stock is reflected in shopping cart
- -Verify QUANTITY for each item is reflected 
- -Verify the product price is reflected in shopping cart
- -Verify the product total is reflected in shopping cart
- -Verify ORDER SUMMARY details:
- ​	-Verify SUBTOTAL of  ITEMS
- -Verify SUBTOTAL of  price
- -Verify Shipping 
- -Verify the total price

- Verify Hovering on the “Continue” button.
- Verify Clicking on the “Continue” button.
- -Verify URL , title
- -Verify Secure Checkout in heading
- -Verify Order total is reflected in checkout page
- -Verify the image product is reflected in shopping cart
- -Verify the product name is reflected in shopping cart
- -Verify the product ID is reflected in shopping cart
- -Verify the product in Stock is reflected in shopping cart
- -Verify QUANTITY for each item is reflected 
- -Verify the product price is reflected in shopping cart
- -Verify the product total is reflected in shopping cart
- -Verify ORDER SUMMARY details:
- ​	-Verify SUBTOTAL of  ITEMS
- -Verify SUBTOTAL of  price
- -Verify Shipping 
- -Verify the TAX
- -Verify the total price
- -Verify Filling Shipping Address Section with fake data:
- -Verify on focus field is reflected for every input
- -Verify the * is display on each label for required fields
- -Verify the (optional) is display on each label for optional fields
- -Verify First name field is reflected.
- -Verify Last name field  is reflected.
- -Verify Address line 1 field is reflected.
- -Verify Zip/Postal Code field is reflected.
- -Verify City field is reflected.
- -Verify Phone field is reflected.
- -Verify Ext. field is reflected.
- -Verify Email field is reflected.
- -Verify Phone field is reflected.
- ​		-Verify filling payment method Section with fake data:
- -Verify on focus field is reflected for every input
- -Verify the * is display on each label for required fields
- -Verify the (optional) is display on each label for optional fields
- ​				-Verify Name On Card field is reflected
- -Verify Credit Card Number field is reflected
- -Verify Security Code field is reflected
- -Verify Expiration Date field is reflected
- -Verify BILLING ADDRESS is selected by default 
- Verify Hovering on the “ Review Order” button.
- Verify Clicking on the “ Review Order” button.
- ​		-Verify First name field is reflected in shipping address 
-  		-Verify Last name field  is reflected in shipping address 
- -Verify Address line 1 field is reflected in shipping address
- -Verify Zip/Postal Code field is reflected in shipping address 
- -Verify City field is reflected in shipping address
- -Verify Phone field is reflected in shipping address
- -Verify Ext. field is reflected in shipping address
- -Verify Email field is reflected in shipping address
- -Verify Phone field is reflected in shipping address
- -Verify Edit link is clickable in shipping address
- ​		-Verify payment type is contains starts (*) in payment method section
- ​		-Verify payment type (visa) is ending with same numbers in payment   method section
- -Verify Expiration Date is matched in payment method section
- -Verify Edit link is clickable in shipping address in payment method section

# Scenario 2 Test Plan : Add item with specific filter and quantity scenario

- Verify Hovering over 'Tags & Forms' header nav items:
- -Verify the design is reflected on hover
- -Verify the dropdown is displayed
- Verify Hovering on 'Computers & Registers' category
- Verify Clicking on 'Computers & Registers' category
- ​	-Verify URL , title , heading
- Verify breadcrumb is displayed and contains Tags and forms and computers and registers

- Verify the select tag have "Manufacturer"title by default in filters section
- Verify ‘Casio’ is contains in suggestion menu options
- Verify Model option is disabled by default until select manufacturer
- Verify select the 'Casio' manufacturer 
- Verify the loading page is visible
- Wait until loading page hidden
- Verify the URL contains Casio
- Verify the Casio is selected
- Verify the Casio is displayed in SELECTED FILTERS
- Verify the model is enable
- Verify select 'SP1000' Model.
- Verify the loading page is visible
- Wait until loading page hidden
- Verify the URL contains  'SP1000'
- Verify model id ‘SP1000’ is selected
- Verify the 'SP1000' is displayed in SELECTED FILTERS

- Verify Hovering over resulted product
- Verify Clicking on resulted product
- ​	-verify breadcrumb is displayed and contains Tags & Forms  Computer & Register
- ​		- verify url and title contains product name and ID
- verify the product details:
- ​	-verify product Box number in title matched
- ​	-verify product description contains product name
- ​	-verify  Q&As Write a Review is clickable
- ​	-verify read more is clickable
- ​	-verify product price in the same range of product price
- ​	-verify product list in the same of product list details
- ​	-verify product image is matched 

- ​	verify price in volume pricing table matched product price
- ​	verify the calculated product discount calculated correctly depends on product Qty
- Verify description more section header details:
- verify the product name in product description and product description text

- Verify product description specification section:
- ​				UNITS, MATERIAL, SIZE / DIMENSION
- Verify the questions and answers numbers in product description is matched in Q/A section

- Verify adding 10 items from the product to the cart.
- Verify Hovering on Add to Cart button
- Verify Clicking on Add to Cart button:
- ​	-Verify display loading word in the button and change the text to added to cart
- ​	-Verify the price in the cart is calculated correctly based on discount
- ​	-Verify the product cart number increased 
- ​	-Verify the quantity back to 1
- ​	-Verify the price changed 
- ​	Verify hovering on cart icon:
- -Verify product name 
- -Verify product quantity 
- -Verify total price of items
- -Verify the stock id 
- -Verify product item price
- -Verify sub-total price
- -Verify subtotal item
- -Verify the image 
- Verify clicking on the cart icon
- -Verify URL , title , heading
- -Verify the image product is reflected in shopping cart
- -Verify the product name is reflected in shopping cart
- -Verify the product ID is reflected in shopping cart
- -Verify the product in Stock is reflected in shopping cart
- -Verify QUANTITY for each item is reflected 
- -Verify the product price is reflected in shopping cart
- -Verify the product total is reflected in shopping cart
- -Verify ORDER SUMMARY details:
- ​	-Verify SUBTOTAL of  ITEMS
- -Verify SUBTOTAL of  price
- -Verify the total price

- Verify Hovering on 'Proceed To Checkout'.
- Verify Clicking on 'Proceed To Checkout'.
- Verify Hovering on the “Continue” button.
- Verify Clicking on the “Continue” button.
- Verify Filling Shipping Address Section with fake data:
- Verify filling payment method Section with fake data:
- Verify Hovering on the “ Review Order” button.
- Verify Clicking on the “ Review Order” button.

# Scenario 3 Test Plan :

- Verify Hovering over quick order 
- Verify Clicking on quick order 
- -Verify URL, Title, heading 
- Verify the placeholder exit by default 
- Verify on focus design for each field 
- Verify filling fist input stock number with 2 character 
- -Verify suggest list appears
- -Verify remove button appears
- -Verify loading result appears when typing  
- Verify select first item in menu list
- Verify the Qty, time, price, total appears
- Verify adding random quantities between 5 and 50.
- Verify price and total price changed
- Verify the total price = price * number of Qty
- Verify adding more 4 items and do the same previous steps
- Verify Hovering on Add to Cart button
- Verify Clicking on Add to Cart button:
- Verify URL, Title, heading 
  	-Verify display loading word in the button and change the text to added to cart
  	-Verify the price in the cart is calculated correctly based on discount
  	-Verify the product cart number increased
- -Verify the quantity back to 1
- -Verify the price changed 
  	Verify hovering on cart icon:
- -Verify product name 
- -Verify product quantity 
- -Verify total price of items
- -Verify the stock id 
- -Verify product item price
- -Verify sub-total price
- -Verify subtotal item
- -Verify the image 
- Verify clicking on the cart icon
- -Verify URL , title , heading
- -Verify the image product is reflected in shopping cart
- -Verify the product name is reflected in shopping cart
- -Verify the product ID is reflected in shopping cart
- -Verify the product in Stock is reflected in shopping cart
- -Verify QUANTITY for each item is reflected 
- -Verify the product price is reflected in shopping cart
- -Verify the product total is reflected in shopping cart
- -Verify ORDER SUMMARY details:
- -Verify SUBTOTAL of  ITEMS
  -Verify SUBTOTAL of  price
  -Verify the total price

- Verify Hovering on 'Proceed To Checkout'.
- Verify Clicking on 'Proceed To Checkout'.
- Verify Hovering on the “Continue” button.
- Verify Clicking on the “Continue” button.
- Verify Filling Shipping Address Section with fake data:
- Verify filling payment method Section with fake data:

​		

# Footer Test Plan :

- Verify filling email in “Enter your email” field
- -Verify the placeholder disappears
- Verify Clicking on “SIGN UP” button 
- -Verify thanks message appears
-  Verify all Links navigate to correct page
- Verify customer can content with company email 
- Verify user can change the REGION
- -Verify the loading page
- -Verify the URL change to “ca”
- Verify clicking on leave feedback:
- -Verify the feedback modal appear	

https://docs.google.com/document/d/1dPFBeXnB6JP8Mtz9vJVbaIdb3PdM59wtWcHrX2Yrm7Y/edit
