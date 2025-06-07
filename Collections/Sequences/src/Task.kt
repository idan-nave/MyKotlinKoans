import kotlin.collections.flatMap

// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.
fun findMostExpensiveProductBy(customer: Customer): Product? =
    customer.getDeliveredProducts().maxByOrNull { it.price }

// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int =
    customers.flatMap { it.getOrderedProducts() }.filter { it === product }.size

fun Customer.getOrderedProducts(): Sequence<Product> =
    orders.flatMap { it.products }.asSequence()

fun Customer.getDeliveredProducts(): Sequence<Product> =
    orders.filter { it.isDelivered }.flatMap { it.products }.asSequence()