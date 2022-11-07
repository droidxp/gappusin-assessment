public class com.ansca.corona.events.ImagePickerEvent extends com.ansca.corona.events.Event {
	 /* .source "ImagePickerEvent.java" */
	 /* # instance fields */
	 private java.lang.String fSelectedImageFileName;
	 /* # direct methods */
	 com.ansca.corona.events.ImagePickerEvent ( ) {
		 /* .locals 0 */
		 /* .param p1, "selectedImageFileName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
		 /* .line 16 */
		 if ( p1 != null) { // if-eqz p1, :cond_0
		 } // .end local p1 # "selectedImageFileName":Ljava/lang/String;
	 } // :goto_0
	 this.fSelectedImageFileName = p1;
	 /* .line 17 */
	 return;
	 /* .line 16 */
	 /* .restart local p1 # "selectedImageFileName":Ljava/lang/String; */
} // :cond_0
final String p1 = ""; // const-string p1, ""
} // .end method
/* # virtual methods */
public void Send ( ) {
/* .locals 1 */
/* .prologue */
/* .line 24 */
v0 = this.fSelectedImageFileName;
com.ansca.corona.JavaToNativeShim .imagePickerEvent ( v0 );
/* .line 25 */
return;
} // .end method
