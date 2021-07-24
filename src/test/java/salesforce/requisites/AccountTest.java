package salesforce.requisites;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import salesforce.api.config.Endpoints;
import salesforce.api.entity.Account;
import salesforce.api.manager.EntityManager;


public class AccountTest {
    String accountId;
    String productId;
    String contactId;

    public void authenticate() {
        EntityManager.getToken();
    }

    public void create() throws JsonProcessingException {
        Account account = new Account();
        account.setName("Created Account ");
        accountId = EntityManager.create(new ObjectMapper().writeValueAsString(account), Endpoints.ACCOUNTS.get());
    }

    public void deleteAccount() {
        EntityManager.delete(Endpoints.ACCOUNT.get(), Endpoints.ID.get(), accountId);
    }
}
