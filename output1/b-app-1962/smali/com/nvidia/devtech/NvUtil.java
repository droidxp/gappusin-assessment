public class com.nvidia.devtech.NvUtil {
	 /* .source "NvUtil.java" */
	 /* # static fields */
	 private static com.nvidia.devtech.NvUtil instance;
	 /* # instance fields */
	 private android.app.Activity activity;
	 private java.util.HashMap appLocalValues;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.nvidia.devtech.NvUtil ( ) {
/* .locals 1 */
/* .prologue */
/* .line 37 */
/* new-instance v0, Lcom/nvidia/devtech/NvUtil; */
/* invoke-direct {v0}, Lcom/nvidia/devtech/NvUtil;-><init>()V */
/* .line 34 */
return;
} // .end method
private com.nvidia.devtech.NvUtil ( ) {
/* .locals 3 */
/* .prologue */
/* .line 40 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 38 */
int v0 = 0; // const/4 v0, 0x0
this.activity = v0;
/* .line 42 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.appLocalValues = v0;
/* .line 43 */
v0 = this.appLocalValues;
final String v1 = "STORAGE_ROOT"; // const-string v1, "STORAGE_ROOT"
/* .line 44 */
android.os.Environment .getExternalStorageDirectory ( );
(( java.io.File ) v2 ).getAbsolutePath ( ); // invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
/* .line 43 */
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 45 */
return;
} // .end method
public static com.nvidia.devtech.NvUtil getInstance ( ) {
/* .locals 1 */
/* .prologue */
/* .line 53 */
v0 = com.nvidia.devtech.NvUtil.instance;
} // .end method
/* # virtual methods */
public java.lang.String getAppLocalValue ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "key" # Ljava/lang/String; */
/* .prologue */
/* .line 73 */
v0 = this.appLocalValues;
(( java.util.HashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
} // .end method
public java.lang.String getParameter ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "paramName" # Ljava/lang/String; */
/* .prologue */
/* .line 98 */
v0 = this.activity;
(( android.app.Activity ) v0 ).getIntent ( ); // invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v0 ).getStringExtra ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public Boolean hasAppLocalValue ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "key" # Ljava/lang/String; */
/* .prologue */
/* .line 63 */
v0 = this.appLocalValues;
v0 = (( java.util.HashMap ) v0 ).containsKey ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
} // .end method
public void setActivity ( android.app.Activity p0 ) {
/* .locals 0 */
/* .param p1, "activity" # Landroid/app/Activity; */
/* .prologue */
/* .line 49 */
this.activity = p1;
/* .line 50 */
return;
} // .end method
public void setAppLocalValue ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "key" # Ljava/lang/String; */
/* .param p2, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 83 */
v0 = this.appLocalValues;
(( java.util.HashMap ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 84 */
return;
} // .end method
