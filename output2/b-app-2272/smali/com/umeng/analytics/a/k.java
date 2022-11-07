public class com.umeng.analytics.a.k {
	 /* .source "Page.java" */
	 /* # instance fields */
	 public java.lang.String a;
	 public Integer b;
	 /* # direct methods */
	 public com.umeng.analytics.a.k ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public com.umeng.analytics.a.k ( ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/lang/Exception; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 16 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 17 */
	 int v0 = 0; // const/4 v0, 0x0
	 (( org.json.JSONArray ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
	 this.a = v0;
	 /* .line 18 */
	 int v0 = 1; // const/4 v0, 0x1
	 v0 = 	 (( org.json.JSONArray ) p1 ).getInt ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getInt(I)I
	 /* iput v0, p0, Lcom/umeng/analytics/a/k;->b:I */
	 /* .line 19 */
	 return;
} // .end method
