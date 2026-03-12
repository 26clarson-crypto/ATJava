/* Suppose you have designed an inheritance hierarchy that includes the following relationships:

Guitar is a subclass of Instrument
AcousticGuitar is a subclass of Guitar
ElectricGuitar is a subclass of Guitar

Given the declarations below, which of the objects CANNOT be passed to the method tune(Guitar g) and why??

AcousticGuitar ag;
ElectricGuitar eg;
Guitar myGuitar;
Instrument myInstrument;
 */

// The object that CANNOT be passed to the method tune(Guitar g) is "myInstrument".
// This is because "myInstrument" is declared as an instance of the superclass 
// "Instrument and not the subclass "Guitar". The method tune(Guitar g) expects an object of type Guitar or any of 
// its subclasses (AcousticGuitar or ElectricGuitar), but "myInstrument" is not a Guitar, it is a more general 
// type that does not necessarily have the properties and behaviors of a Guitar. Therefore, passing "myInstrument" 
// to the method would result in a type mismatch error.