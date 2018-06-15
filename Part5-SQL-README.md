# SQL

Given this table in the database, write the command to execute on the table. 
You can test out your code on [w3school](https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_join) 

NOTE: 
1. In real life, you can put column and table name in quote, but for this test, don't do it.
2. Put `;` at the end of all your statement.  
2. If you tested your code on w3school and it works, but the test doesn't pass. THAT IS OK!

HINT: To escape a quote, use `\"`.

|CustomerID	|CustomerName|ContactName|Address| City	| PostalCode| Country|
|-----------|------------|-----------|-------|------|-----------|---------|
|1|Alfreds Futterkiste|Maria Anders|Obere Str. 57|Berlin|12209|Germany|
|2|Ana Trujillo|Ana Trujillo|Avda. de la Constitución 2222|México D.F.|05021|Mexico|
|3|Antonio Moreno Taquería|Antonio Moreno|Mataderos 2312 |México D.F.|05023|Mexico|

1. `selectAll` - Given a table name, select all the data from that column
2. `selectColumn` - Given a table name and a column, return all the data from that column. 
For example, given the above table, `selectColumn("Customers", "PostalCode)` will return 12209, 05021,  05023.
3. `selectWhere` - Given a table name, a column, and a value, I want to get all the information for 
that customer whose information matches the value I give. 
For example, `selectWhere("Customers", "CustomerID", "2")` will return the customer information with the id 2.
Of `selectWhere("Customers", "Country", "Mexico")` will return  
|CustomerID	|CustomerName|ContactName|Address| City	| PostalCode| Country|
|-----------|------------|-----------|-------|------|-----------|---------|
|2|Ana Trujillo|Ana Trujillo|Avda. de la Constitución 2222|México D.F.|05021|Mexico|
|3|Antonio Moreno Taquería|Antonio Moreno|Mataderos 2312 |México D.F.|05023|Mexico|
4. `count` - Given a table name, count how many entries it has. For example, the Customers table has 91 entries. User * for the count.