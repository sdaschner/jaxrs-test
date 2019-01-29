FROM open-liberty:javaee8

COPY target/jaxrs-test.war /config/dropins/
