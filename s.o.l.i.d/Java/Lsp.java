//LSP(Likiov-Substitution Principle) : It states that subtype class should substitutable their base type without
// altering the correctness of the program

interface Bird {
    public void Flyable();
}

class Sparrow implements Bird {

    @Override
    public void Flyable() {
        System.out.println("Sapprrow is flying");
    }

}

class Ostrich implements Bird {

    @Override
    public void Flyable() {
        throw new UnsupportedOperationException("Ostrich is not Flayable");
    }

}

// above commented is example of breaking LSP principle if we replace Sparrow class with Ostrich it will gave runtime error
// so, LSP principle state that it should be replacable. 