<%--
  Created by IntelliJ IDEA.
  User: salimhanov
  Date: 11.07.2014
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div>
    <h2>Создать аккаунт</h2>
    <sf:form method="POST" modelAttribute="user"> <!-- Связать форму -->
        <fieldset> <!-- с атрибутом модели -->
            <table cellspacing="0">
                <tr>
                    <th><label for="lastName">Имя</label></th>
                    <td><sf:input path="lastName" size="15" id="lastName"/></td>
                </tr>
                <tr>
                    <th><label for="login">Пользователь:</label></th>
                    <td><sf:input path="login" size="15" maxlength="15"
                                  id="login"/> <!-- Поле имени пользователя -->
                        <small id="username_msg">No spaces, please.</small>
                    </td>
                </tr>
                <tr>
                    <th><label for="password">Password:</label></th>
                    <td><sf:password path="password" size="30"
                                     showPassword="true"
                                     id="password"/> <!-- Поле пароля -->
                        <small>6 characters or more (be tricky!)</small>
                    </td>
                </tr>
                <tr>
                    <th><label for="email"> Почта </label></th>
                    <td><sf:input path="email" size="30"
                                  id="email"/> <!-- Поле электронной почты -->
                        <small>In case you forget something</small>
                    </td>
                </tr>
               </table>
        </fieldset>
    </sf:form>
</div>