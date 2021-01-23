<p align="center">
  <a href="https://cdn1.bbcode0.com/" target="blank"><img src="https://cdn1.bbcode0.com/uploads/2021/1/23/1fbb7da7f53bd0dcb75962160055f291-full.png"/></a>
</p>

## Mr. Z Establishment Management System
```$xslt
This is a Software that explains how Mr.Z can manage is one establishment "AZ" with two 
outlets "AB" and "AC" with the ability to get total list or partial list of transactions
from both outlets in one table. The application as a Mock payment API to better illustration.
This application should be TDD (Test Driven Development) and a Test Payment Services should have been used 
but due to limited time I cannot achieve that.
I can be sure to push these up at latter time. 

```

# Home page

<p>
https://cdn1.bbcode0.com/uploads/2021/1/23/9913150f2d6fa2732f6f543acc76ef51-full.png
</p>

# OutLets' Page
<p>
https://cdn1.bbcode0.com/uploads/2021/1/23/ae10cbfd4fb0b2bcc09abfc7bb0e760c-full.png
</p>

# Below is where to input show transaction logic
<p>
https://cdn1.bbcode0.com/uploads/2021/1/23/eb936b6572a6500b9df48cc5c371e9e9-full.png
</p>

# Below is a mock customer page for payment.
<p>
https://cdn1.bbcode0.com/uploads/2021/1/23/f4d2b628ad6e14934f73d0c21133ec7c-full.png
</p>


# Spring boot Setup
```$xslt
A starter project can be downloaded with all dependencies from
```
https://start.spring.io/


## Environment Setup
```$xslt
The environment for this application is setup in the file below

/application.properties 

```

# How to Run
```$xslt
Application runs in main method
```

```$xslt
package com.MrZ.mrz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MrzApplication {

	public static void main(String[] args) {
		SpringApplication.run(MrzApplication.class, args);
	}

}
```


```$xslt
In other to run successfully, you do need to setup the Mysql Scheme.

 1. Visit: /application.properties 
    
 2. Input:  spring.jpa.hibernate.ddl-auto= update
 
Above will automatically generate the table in MySQL workbench with predefined Database schema setup in the 
/application.properties

```

# Important APIs

1. The main dashboard: http://localhost:8080/dashboard/az-Enterprise

2. For mock payment:  http://localhost:8080//sourceac-list

3. To show transactions: http://localhost:8080/enterprise/show-all-transaction

4. To show List of outlets for AZ establishment for Mr.Z: http://localhost:8080/dashboard/enterprise/listOfOutLets?enterpriseId=1

# Thank you for reading.



