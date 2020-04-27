package com.company;

/*

2113 Hippodrome (4)
Now back to the horses. Each horse at the races must be known name (name) and speed (speed).
Our horses will run just a certain time (100 seconds / "steps").
We will determine the winner as a horse that has run the greatest distance.
Therefore, we will also need to store the distance (distance) that the horse has already run.
Add the name (String), speed (double), distance (double) variables to the Horse class.

Requirements:
1. In the Horse class, the name field must be created.
2. In the Horse class, the speed field must be created.
3. In the Horse class, the distance field must be created.
4. The name field must be of type String.
5. The speed field must be of type double.
6. The distance field must be of type double.
________________________________________
Hippodrome (3)
Despite the fact that we declared the horses variable, the list itself has not yet been created (unless of course you managed to get ahead of us).
Create a constructor for the Hippodrome class with one parameter of type List.
Save the list received as a parameter in the horses field (initialize the horses field).
________________________________________
Hippodrome (2)
Since this is a hippodrome, then there should be horses on it.
So our hippodrome must keep a list of all his horses.
Add a horses field of type List <Horse> to the Hippodrome class.
And so that the horses are not stolen - make this field private.
Add getter for this field.
________________________________________
Hippodrome (1)
Today we will write a small game called "Hippodrome".
When I say we - I mean you. I will work as a mentor.
First, we need the classes "racetrack" and "horse".
Create classes Hippodrome (hippodrome), Horse (horse).
Also, don't forget that any program starts with the main method.
Add it to the Hippodrome class.

 */
import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;

    public List<Horse> getHorses() {
        return this.horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) {

    }
}

