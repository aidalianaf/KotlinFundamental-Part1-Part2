fun main() {
    val user = setUser("Aida Liana", "Makan", 15)
    print(user)
}
fun setUser(name: String, hobby: String, age: Int) =
    "My name is $name, I like $hobby and, I'm $age years old"