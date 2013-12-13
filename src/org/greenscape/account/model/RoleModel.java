/**
 * 
 */
package org.greenscape.account.model;

/**
 * @author Sheikh Sajid
 * 
 */
public interface RoleModel {
	String MODEL_NAME = "Role";
	String ROLE_ID = "roleId";
	String NAME = "name";
	String DESCRIPTION = "description";
	String ORGANIZATION_ID = "organizationId";

	Long getRoleId();

	RoleModel setRoleId(Long roleId);

	Long getOrganizationId();

	RoleModel setOrganizationId(Long orgId);

	String getName();

	RoleModel setName(String name);

	String getDescription();

	RoleModel setDescription(String description);
}
