select Customers.name AS Customers from Customers LEFT JOIN Orders
ON Customers.id = Orders.customerId where customerID is null;