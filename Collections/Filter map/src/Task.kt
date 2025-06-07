// Find all the different cities the customers are from
fun Shop.getCustomerCities(): Set<City> =
    customers.map { customer -> customer.city }.toSet()

// Find the customers living in a given city
fun Shop.getCustomersFrom(city: City): List<Customer> =
    customers.filter { customer -> customer.city === city }
