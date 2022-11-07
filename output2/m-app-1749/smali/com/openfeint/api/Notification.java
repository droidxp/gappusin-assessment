public abstract class com.openfeint.api.Notification {
	 /* .source "Notification.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/api/Notification$Type;, */
	 /* Lcom/openfeint/api/Notification$Category;, */
	 /* Lcom/openfeint/api/Notification$Delegate; */
	 /* } */
} // .end annotation
/* # static fields */
private static com.openfeint.api.Notification$Delegate sDelegate;
/* # direct methods */
static com.openfeint.api.Notification ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 46 */
	 /* new-instance v0, Lcom/openfeint/api/Notification$Delegate; */
	 /* invoke-direct {v0}, Lcom/openfeint/api/Notification$Delegate;-><init>()V */
	 return;
} // .end method
public com.openfeint.api.Notification ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 11 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 80 */
	 return;
} // .end method
public static com.openfeint.api.Notification$Delegate getDelegate ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 47 */
	 v0 = com.openfeint.api.Notification.sDelegate;
} // .end method
public static void setDelegate ( com.openfeint.api.Notification$Delegate p0 ) {
	 /* .locals 0 */
	 /* .param p0, "delegate" # Lcom/openfeint/api/Notification$Delegate; */
	 /* .prologue */
	 /* .line 56 */
	 return;
} // .end method
/* # virtual methods */
public abstract com.openfeint.api.Notification$Category getCategory ( ) {
} // .end method
public abstract java.lang.String getText ( ) {
} // .end method
public abstract com.openfeint.api.Notification$Type getType ( ) {
} // .end method
public abstract java.util.Map getUserData ( ) {
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "()", */
	 /* "Ljava/util/Map", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Object;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end method
