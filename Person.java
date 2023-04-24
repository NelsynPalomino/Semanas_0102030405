
package S03;
class Person {
  String name;
  String age;
  
  void sayName() {
    print(this.name);
  }
}

class Student extends Person {
  String studentNumber;
}