class Dog(private var age: Int, val name: String) {

    fun incrementAge() {
        age++
    }

    fun getInfo(): String {
        return "age: $age, name: $name"
    }

}// this is show the operators 3 Dog to have "equals" function to work properly or not. This is connecting to the operators 3.
