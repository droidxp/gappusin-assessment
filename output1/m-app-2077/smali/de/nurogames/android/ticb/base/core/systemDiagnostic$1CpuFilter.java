class de.nurogames.android.ticb.base.core.systemDiagnostic$1CpuFilter implements java.io.FileFilter {
	 /* .source "systemDiagnostic.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/nurogames/android/ticb/base/core/systemDiagnostic;->getNumCores()I */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "CpuFilter" */
} // .end annotation
/* # direct methods */
 de.nurogames.android.ticb.base.core.systemDiagnostic$1CpuFilter ( ) {
/* .locals 0 */
/* .prologue */
/* .line 58 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean accept ( java.io.File p0 ) {
/* .locals 2 */
/* .param p1, "pathname" # Ljava/io/File; */
/* .prologue */
/* .line 63 */
final String v0 = "cpu[0-9]"; // const-string v0, "cpu[0-9]"
(( java.io.File ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
v0 = java.util.regex.Pattern .matches ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 64 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 66 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
