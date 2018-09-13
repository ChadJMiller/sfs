package com.noofinc.dsm.webapi.client.filestation.sharelist;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.noofinc.dsm.webapi.client.filestation.common.Acl;

public class SharePermission {

    public enum ShareRight {
        RW, RO
    }

    private final Acl acl;
    private final boolean aclEnabled;
    private final SpecialPrivilege specialPrivilege;
    private final boolean aclMode;
    private final int posix;
    private final ShareRight shareRight;

    @JsonCreator
    public SharePermission(@JsonProperty("acl") Acl acl,
                           @JsonProperty("acl_enable") boolean aclEnabled,
                           @JsonProperty("adv_right") SpecialPrivilege specialPrivilege,
                           @JsonProperty("is_acl_mode") boolean aclMode,
                           @JsonProperty("posix") int posix,
                           @JsonProperty("share_right") ShareRight shareRight) {
        this.acl = acl;
        this.aclEnabled = aclEnabled;
        this.specialPrivilege = specialPrivilege;
        this.aclMode = aclMode;
        this.posix = posix;
        this.shareRight = shareRight;
    }

    public Acl getAcl() {
        return acl;
    }

    public boolean isAclEnabled() {
        return aclEnabled;
    }

    public SpecialPrivilege getSpecialPrivilege() {
        return specialPrivilege;
    }

    public boolean isAclMode() {
        return aclMode;
    }

    public int getPosix() {
        return posix;
    }

    public ShareRight getShareRight() {
        return shareRight;
    }
}
