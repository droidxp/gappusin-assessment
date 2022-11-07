public class de.nurogames.android.ticb.base.core.UpdateElement {
	 /* .source "UpdateElement.java" */
	 /* # instance fields */
	 private java.lang.String m_update_desc;
	 private java.lang.String m_update_version;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.core.UpdateElement ( ) {
		 /* .locals 0 */
		 /* .param p1, "update_version" # Ljava/lang/String; */
		 /* .param p2, "update_desc" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 25 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 32 */
		 this.m_update_version = p1;
		 /* .line 33 */
		 this.m_update_desc = p2;
		 /* .line 35 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String Desc ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 38 */
		 v0 = this.m_update_desc;
	 } // .end method
	 public java.lang.String Version ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 37 */
		 v0 = this.m_update_version;
	 } // .end method
