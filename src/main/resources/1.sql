FUNCTION get_supplier_name_for_job_posting(
userType integer, suppressSupplierFlag BIT, roleFlag BIT, status INT, isMspCoordinator BIT, supplierName NVARCHAR(100))
RETURNS TABLE AS
RETURN
 SELECT CASE WHEN (userType =1 and isMspCoordinator = 0 and suppressSupplierFlag = 1 and @roleFlag = 0and@statusIN(0,1,7,8,5,20,26,30,31,36,41,47,10,54,56,60,61,62,63,64,72,11,73,74,75,76,82,83, -1,71,6))
 THEN
 '-'
 ELSE N''+@supplierName END AS supplier_name

GO