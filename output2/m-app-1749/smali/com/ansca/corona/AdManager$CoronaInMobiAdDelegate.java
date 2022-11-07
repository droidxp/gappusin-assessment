class com.ansca.corona.AdManager$CoronaInMobiAdDelegate {
	 /* .source "AdManager.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/AdManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "CoronaInMobiAdDelegate" */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Lcom/ansca/corona/AdManager$CoronaInMobiAdDelegate$ChangeInMobiVisibilityOperation; */
/* } */
} // .end annotation
/* # instance fields */
private java.lang.String fApplicationId;
private Boolean fIsTestModeEnabled;
final com.ansca.corona.AdManager this$0; //synthetic
/* # direct methods */
public com.ansca.corona.AdManager$CoronaInMobiAdDelegate ( ) {
/* .locals 0 */
/* .param p2, "applicationId" # Ljava/lang/String; */
/* .param p3, "testModeEnabled" # Z */
/* .prologue */
/* .line 74 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 75 */
this.fApplicationId = p2;
/* .line 76 */
/* iput-boolean p3, p0, Lcom/ansca/corona/AdManager$CoronaInMobiAdDelegate;->fIsTestModeEnabled:Z */
/* .line 77 */
return;
} // .end method
private void raiseAdRequestEvent ( Boolean p0 ) {
/* .locals 1 */
/* .param p1, "isError" # Z */
/* .prologue */
/* .line 128 */
com.ansca.corona.Controller .getEventManager ( );
/* .line 129 */
/* .local v0, "eventManager":Lcom/ansca/corona/events/EventManager; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 130 */
(( com.ansca.corona.events.EventManager ) v0 ).adRequestEvent ( p1 ); // invoke-virtual {v0, p1}, Lcom/ansca/corona/events/EventManager;->adRequestEvent(Z)V
/* .line 132 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public Integer age ( ) {
/* .locals 1 */
/* .prologue */
/* .line 143 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String areaCode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 149 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.location.Location currentLocation ( ) {
/* .locals 1 */
/* .prologue */
/* .line 155 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.util.Date dateOfBirth ( ) {
/* .locals 1 */
/* .prologue */
/* .line 161 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer income ( ) {
/* .locals 1 */
/* .prologue */
/* .line 185 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String interests ( ) {
/* .locals 1 */
/* .prologue */
/* .line 191 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isLocationInquiryAllowed ( ) {
/* .locals 1 */
/* .prologue */
/* .line 197 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isPublisherProvidingLocation ( ) {
/* .locals 1 */
/* .prologue */
/* .line 203 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String keywords ( ) {
/* .locals 1 */
/* .prologue */
/* .line 209 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String postalCode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 215 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String searchString ( ) {
/* .locals 1 */
/* .prologue */
/* .line 221 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String siteId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 137 */
v0 = this.this$0;
com.ansca.corona.AdManager .access$000 ( v0 );
} // .end method
public Boolean testMode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 227 */
/* iget-boolean v0, p0, Lcom/ansca/corona/AdManager$CoronaInMobiAdDelegate;->fIsTestModeEnabled:Z */
} // .end method
