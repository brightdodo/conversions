# conversions
API for common metric conversions

Create a service capable of serving the following endpoints:
For all of the below endpoints a log entry needs to be created for their execution duration.

/conversions/ktoc
The ktoc endpoint should produce an output amount in celsius when given an input amount in kelvin.

/conversions/ctok
The ctok endpoint should produce an output amount in kelvin when given an input amount in celsius.

/conversions/mtok
The mtok endpoint should produce, when given an input amount in miles, an output amount in kilometers.

/conversions/ktom The ktom endpoint should produce, when given an input amount in kilometers, an output amount in miles.

This is a spring boot implementation which uses a filter to log the request duration and exposes REST endpoints above.
To run project build with command mvn package and run the output jar then use the postman collection in the resources
folder to test. to run tests use mvn test or mvn verify
