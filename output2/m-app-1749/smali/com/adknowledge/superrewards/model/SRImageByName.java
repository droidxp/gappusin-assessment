public class com.adknowledge.superrewards.model.SRImageByName {
	 /* .source "SRImageByName.java" */
	 /* # static fields */
	 static Integer id;
	 /* # direct methods */
	 public com.adknowledge.superrewards.model.SRImageByName ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 5 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Integer getDirectPayImageByName ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "name" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 11 */
		 (( java.lang.String ) p0 ).toLowerCase ( ); // invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
		 /* .line 13 */
		 final String v0 = "paypal"; // const-string v0, "paypal"
		 v0 = 		 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 17 */
		 } // :goto_0
		 /* .line 14 */
	 } // :cond_0
	 final String v0 = "credit card"; // const-string v0, "credit card"
	 v0 = 	 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 15 */
	 } // :cond_1
	 final String v0 = "google"; // const-string v0, "google"
	 v0 = 	 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 16 */
	 } // :cond_2
	 final String v0 = "zong"; // const-string v0, "zong"
	 v0 = 	 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* .line 17 */
	 } // :cond_3
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
