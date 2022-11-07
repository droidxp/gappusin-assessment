public class de.nurogames.android.ticb.base.core.UpdateDataSet {
	 /* .source "UpdateDataSet.java" */
	 /* # instance fields */
	 private java.lang.String elementDesc;
	 private java.lang.String elementVersion;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.core.UpdateDataSet ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 4 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 6 */
		 final String v0 = ""; // const-string v0, ""
		 this.elementVersion = v0;
		 /* .line 7 */
		 final String v0 = ""; // const-string v0, ""
		 this.elementDesc = v0;
		 /* .line 4 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String getDesc ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 15 */
		 v0 = this.elementDesc;
	 } // .end method
	 public java.lang.String getVersion ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 10 */
		 v0 = this.elementVersion;
	 } // .end method
	 public void setDesc ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 17 */
		 this.elementDesc = p1;
		 return;
	 } // .end method
	 public void setVersion ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 12 */
		 this.elementVersion = p1;
		 return;
	 } // .end method
