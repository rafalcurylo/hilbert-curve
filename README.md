build:
  mvn clean install

run:
  java -cp target/hilbert-curve.jar com.rafalcurylo.hilbertCurve.Hilbert 5

Parameter is a curve level.

Examples:

java -cp target/hilbert-curve.jar com.rafalcurylo.hilbertCurve.Hilbert 2
![lvl2](examples/lvl2.png?raw=true "lvl2")

java -cp target/hilbert-curve.jar com.rafalcurylo.hilbertCurve.Hilbert 3
![lvl3](examples/lvl3.png?raw=true "lvl3")

java -cp target/hilbert-curve.jar com.rafalcurylo.hilbertCurve.Hilbert 5
![lvl5](examples/lvl5.png?raw=true "lvl5")
