package org.smartdatahub.liq.entity.dao;

import org.smartdatahub.liq.entity.view.VrpFacStatus;
import org.springframework.stereotype.Component;

/** @author Sonja Piel (smartdatahub.org) */
@Component
public class VrpFacStatusQueryDAO extends AbstractJpaDAO<VrpFacStatus, String> {

  public VrpFacStatusQueryDAO() {
    super(VrpFacStatus.class, String.class);
  }
  
}
