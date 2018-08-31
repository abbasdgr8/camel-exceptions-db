# exceptions-db
Extensions to exceptions-core providing additional Exceptions for database-wrangling problems.

It's recommended when you're handling exceptions in Backend/Middleware systems that you differentiate between recoverable and irrecoverable exceptions.  These classes take the representations of these two types of exception (from [exceptions-core](https://github.com/abbasdgr8/exceptions-core)) and create database-specific subclasses.  

They are very simple, extending the relevant Recoverable or IrrecoverableException, and providing a meaningful classname.  Nothing beyond that.  
