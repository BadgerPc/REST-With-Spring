package org.rest.sec.web.privilege;

import org.rest.common.util.order.OrderByName;
import org.rest.sec.client.template.PrivilegeRESTTemplateImpl;
import org.rest.sec.model.Privilege;
import org.rest.sec.test.SecSortRESTIntegrationTest;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.collect.Ordering;

public class PrivilegeSortRESTIntegrationTest extends SecSortRESTIntegrationTest<Privilege> {

    @Autowired
    private PrivilegeRESTTemplateImpl template;

    public PrivilegeSortRESTIntegrationTest() {
        super(Privilege.class);
    }

    // tests

    // template method (shortcuts)

    @Override
    protected final Privilege createNewEntity() {
        return template.createNewEntity();
    }

    @Override
    protected final String getURI() {
        return template.getURI();
    }

    @Override
    protected final PrivilegeRESTTemplateImpl getAPI() {
        return template;
    }

    @Override
    protected final Ordering<Privilege> getOrdering() {
        return new OrderByName<Privilege>();
    }

}
