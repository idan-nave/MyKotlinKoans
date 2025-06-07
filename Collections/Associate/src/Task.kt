// Build a map from the customer name to the customer
fun Shop.nameToCustomerMap(): Map<String, Customer> =
    customers.associateBy { customer -> customer.name }// values exist - keys are to be set

// Build a map from the customer to their city
fun Shop.customerToCityMap(): Map<Customer, City> =
    customers.associateWith { customer -> customer.city }// keys exist - values are to be set

// Build a map from the customer name to their city
fun Shop.customerNameToCityMap(): Map<String, City> =
    customers.associate { customer-> customer.name to customer.city } //full map keys&values
