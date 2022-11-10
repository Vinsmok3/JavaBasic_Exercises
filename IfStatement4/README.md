# Exercise: If Statement 4
* define a class called `Person` that has:
  * 1 instance variable:
    * an integer `age`
  * a constructor method that:
    * generates and prints a random value using `Math.floor(Math.random()*(max-min+1)+min)`, where `min=5` and `max=80`
    * assigns the random value to the instance variable (remember to do a [narrowing casting](https://www.w3schools.com/java/java_type_casting.asp))
  * a method `getLifeStage` that returns a string about the life stage of the `Person`:
    * <=12 is a `Child`
    * 13-19 is a `Teen`
    * 20-59 is an `Adult`
    * +60 is a `Senior Adult`
* define a testing class where you:
  * create a `Person`
  * call the `getLifeStage` method and print the result: `The person is in the X stage of life`
