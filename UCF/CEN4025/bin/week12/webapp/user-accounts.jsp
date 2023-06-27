<%@page import="week12.app.User"%>
<%@page import="week12.app.Account"%>
<%@page import="week12.data.DataAccess"%>
<%@page import="java.util.List"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>CEN4025 ATM Project - Acccounts</title>
    <%
    User curUser = null;
    Object obj = request.getSession().getAttribute("user");
    if( obj instanceof User)
    {
    	curUser = (User)obj;
	}
	else
	{
		curUser = new User(-1, -1, "", "");
	}
	
	DataAccess da = new DataAccess();
	da.connect();
	List<Account> accountList = da.getUserAccounts(curUser);
	da.disconnect();
    %>
</head>
<body style="height: 500px; background-image: url(./images/background.jpg);">
    <!-- Header -->
    <div class="atmcenter header">
        <table style="width: 100%">
            <tr>
                <td style="width: 35px;">
                    <img src="./images/logo.png" style="width: 32px;" />&nbsp;
                    <span style="font-size: 8pt;">ver 3</span>
                </td>
                <td style="text-align: center; font-size: larger; font-weight: bolder; font-family: Verdana;">
                    CEN4025 ATM Project - Accounts 
                    <%
                        out.print(curUser.getFirstName() + " " + curUser.getLastName());
                    %>
                </td>
            </tr>
        </table>
    </div>
    <!-- Content -->
    <hr />
    <div style="height: 500px;">
        <table style="width: 100%;">
            <tr>
                <td style="vertical-align: top; text-align: left; background-color: silver; width: 150px;
                    height: 500px; border-right: 1px solid black;">
                    <a href="index.html">Home</a><br />
                    <a href="LogoutServlet">Logout</a><br />
                </td>
                <td style="text-align: center; width: 80%; vertical-align: top;">
                    &nbsp; Welcome to CEN4025 ATM&nbsp;
                    <%
                        out.print(curUser.getFirstName());
                    %>!
                    
                    <br />
                    <table style="width: 100%;">
                    <tr>
                    <td>
                    <ul>
                    <%
                    out.print("Number of accounts: ");
                    out.println(accountList.size());
                    for(Account a : accountList)
                    {
                    	out.print("<li>");
                    	out.print(a.getName());
                    	out.println("</li>");
                    }
                    %>
                    </ul>
                    </td>
                    </tr>
                    </table>
                </td>
                <td style="vertical-align: top; border-left: 1px solid black; text-align: center;">
                    <img src="./images/card-image.jpg" style="width: 125px;" /><br />
                    <span style="font-family: Verdana; font-size: 8pt; text-aligh: center;">Apply!</span>
                </td>
            </tr>
        </table>
    </div>
    <!-- Footer -->
    <div style="font-family: Times New Roman; font-size: small; text-align: center;">
        <hr />
        <span style="font-family: Times New Roman; font-size: small; text-align: center;">Copyright
            &copy; CEN4025</span>
    </div>
</body>
</html>
