# AccountManagement_PB3D
// User Stories Pragya Tomar
Manager:
1.Verify pan card of a customer
2.Create main customer account
3.Create new savings account for customer

1.The customer’s Pan Card is verified first.
2.Then we check if the customer already exists.
3.If the customer is not a registered, user a prompt is generated
4.If the customer is registered the API shows registered message along with the Customer ID number of the account with which the PAN has been registered with.
5.Request requires the PAN number of the customer.
6.Response shows whether the customer account exists or not. If yes it also gives the Customer ID.


Our application is used by the Manager to create customer’s online account and savings accounts. The manager creates an online account for a Customer in this API.
He receives details from customer to create an account as shown below 
Pan card number and image – Pan card number should be in (xxxxx1234x) format.
Aadhar card number and image – Aadhar card number should be 12 digits long.
Date of Birth and
Postal
Name
Email
It will create the appropriate entries in Customer DB table and User DB table, after hitting the API with the details above. 
It will also send out a mail to the customer with username and temporary password.
The API response will have the customerID from DB. 

