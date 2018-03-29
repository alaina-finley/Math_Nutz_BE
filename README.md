INSTRUCTIONS TO START SERVER:

1. First, make sure to run commands in psqlTables.sql to create a local database on your machine. This means you will have to connect to postgres using the command: "psql postgres".
2. Replace the "replaceWithFrontend" folder in Math_Nutz_BE with the "frontend" folder from Math_Nutz_FE.
3. Once in the Math_Nutz_BE folder, run: "mvn clean install".
4. cd into /backend
5. Once in Math_Nutz_BE/backend, run: "mvn spring-boot:run"
6. Make sure to use 'CTRL-C' to kill the server once you're done, or it will drain your computer (speaking from experience).
