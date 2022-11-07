public class com.openfeint.api.resource.CloudStorage {
	 /* .source "CloudStorage.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/api/resource/CloudStorage$DeleteCB;, */
	 /* Lcom/openfeint/api/resource/CloudStorage$SaveCB;, */
	 /* Lcom/openfeint/api/resource/CloudStorage$LoadCB;, */
	 /* Lcom/openfeint/api/resource/CloudStorage$ListCB; */
	 /* } */
} // .end annotation
/* # static fields */
public static Integer MAX_SIZE;
private static java.util.regex.Pattern sValidKeyPattern;
/* # direct methods */
static com.openfeint.api.resource.CloudStorage ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 42 */
	 /* const/high16 v0, 0x40000 */
	 return;
} // .end method
public com.openfeint.api.resource.CloudStorage ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 40 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 238 */
	 return;
} // .end method
public static void delete ( java.lang.String p0, com.openfeint.api.resource.CloudStorage$DeleteCB p1 ) {
	 /* .locals 5 */
	 /* .param p0, "key" # Ljava/lang/String; */
	 /* .param p1, "cb" # Lcom/openfeint/api/resource/CloudStorage$DeleteCB; */
	 /* .prologue */
	 /* .line 251 */
	 com.openfeint.internal.OpenFeintInternal .getInstance ( );
	 (( com.openfeint.internal.OpenFeintInternal ) v3 ).getUserID ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/OpenFeintInternal;->getUserID()Ljava/lang/String;
	 /* .line 252 */
	 /* .local v2, "userID":Ljava/lang/String; */
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 v3 = 		 (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
		 /* if-nez v3, :cond_1 */
		 /* .line 253 */
	 } // :cond_0
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 /* .line 254 */
		 final String v3 = "The user who owns this CloudStorage blob is not logged in.The CloudStorage blob specified was not deleted."; // const-string v3, "The user who owns this CloudStorage blob is not logged in.The CloudStorage blob specified was not deleted."
		 (( com.openfeint.api.resource.CloudStorage$DeleteCB ) p1 ).onFailure ( v3 ); // invoke-virtual {p1, v3}, Lcom/openfeint/api/resource/CloudStorage$DeleteCB;->onFailure(Ljava/lang/String;)V
		 /* .line 258 */
	 } // :cond_1
	 v3 = 	 com.openfeint.api.resource.CloudStorage .isValidKey ( p0 );
	 /* if-nez v3, :cond_2 */
	 /* .line 259 */
	 if ( p1 != null) { // if-eqz p1, :cond_2
		 /* .line 260 */
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v4 = "\'"; // const-string v4, "\'"
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* if-nez p0, :cond_3 */
		 final String v3 = "(null)"; // const-string v3, "(null)"
	 } // :goto_0
	 (( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v4 = "\' is not a valid CloudStorage key."; // const-string v4, "\' is not a valid CloudStorage key."
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( com.openfeint.api.resource.CloudStorage$DeleteCB ) p1 ).onFailure ( v3 ); // invoke-virtual {p1, v3}, Lcom/openfeint/api/resource/CloudStorage$DeleteCB;->onFailure(Ljava/lang/String;)V
	 /* .line 264 */
} // :cond_2
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v3 ).getAppID ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/OpenFeintInternal;->getAppID()Ljava/lang/String;
/* .line 266 */
/* .local v0, "appID":Ljava/lang/String; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "/xp/users/"; // const-string v4, "/xp/users/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "/games/"; // const-string v4, "/games/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "/save_cards/"; // const-string v4, "/save_cards/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 268 */
/* .local v1, "path":Ljava/lang/String; */
/* new-instance v3, Lcom/openfeint/api/resource/CloudStorage$4; */
/* invoke-direct {v3, v1, p1}, Lcom/openfeint/api/resource/CloudStorage$4;-><init>(Ljava/lang/String;Lcom/openfeint/api/resource/CloudStorage$DeleteCB;)V */
(( com.openfeint.api.resource.CloudStorage$4 ) v3 ).launch ( ); // invoke-virtual {v3}, Lcom/openfeint/api/resource/CloudStorage$4;->launch()V
/* .line 279 */
return;
} // .end local v0 # "appID":Ljava/lang/String;
} // .end local v1 # "path":Ljava/lang/String;
} // :cond_3
/* move-object v3, p0 */
/* .line 260 */
} // .end method
public static Boolean isValidKey ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "key" # Ljava/lang/String; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 289 */
/* if-nez p0, :cond_0 */
/* .line 297 */
} // :goto_0
/* .line 290 */
} // :cond_0
v2 = com.openfeint.api.resource.CloudStorage.sValidKeyPattern;
/* if-nez v2, :cond_1 */
/* .line 292 */
try { // :try_start_0
final String v2 = "[a-zA-Z][a-zA-Z0-9-_]*"; // const-string v2, "[a-zA-Z][a-zA-Z0-9-_]*"
java.util.regex.Pattern .compile ( v2 );
/* :try_end_0 */
/* .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 297 */
} // :cond_1
v1 = com.openfeint.api.resource.CloudStorage.sValidKeyPattern;
(( java.util.regex.Pattern ) v1 ).matcher ( p0 ); // invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v1 = (( java.util.regex.Matcher ) v1 ).matches ( ); // invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z
/* .line 293 */
/* :catch_0 */
/* move-exception v0 */
/* .line 294 */
/* .local v0, "e":Ljava/util/regex/PatternSyntaxException; */
} // .end method
public static void list ( com.openfeint.api.resource.CloudStorage$ListCB p0 ) {
/* .locals 5 */
/* .param p0, "cb" # Lcom/openfeint/api/resource/CloudStorage$ListCB; */
/* .prologue */
/* .line 62 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v3 ).getUserID ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/OpenFeintInternal;->getUserID()Ljava/lang/String;
/* .line 63 */
/* .local v2, "userID":Ljava/lang/String; */
if ( v2 != null) { // if-eqz v2, :cond_0
v3 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* if-nez v3, :cond_1 */
/* .line 64 */
} // :cond_0
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 65 */
final String v3 = "A user must be logged in to list their persisted CloudStorage blobs."; // const-string v3, "A user must be logged in to list their persisted CloudStorage blobs."
(( com.openfeint.api.resource.CloudStorage$ListCB ) p0 ).onFailure ( v3 ); // invoke-virtual {p0, v3}, Lcom/openfeint/api/resource/CloudStorage$ListCB;->onFailure(Ljava/lang/String;)V
/* .line 69 */
} // :cond_1
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v3 ).getAppID ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/OpenFeintInternal;->getAppID()Ljava/lang/String;
/* .line 71 */
/* .local v0, "appID":Ljava/lang/String; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "/xp/users/"; // const-string v4, "/xp/users/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "/games/"; // const-string v4, "/games/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "/save_cards"; // const-string v4, "/save_cards"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 72 */
/* .local v1, "path":Ljava/lang/String; */
/* new-instance v3, Lcom/openfeint/api/resource/CloudStorage$1; */
/* invoke-direct {v3, v1, p0}, Lcom/openfeint/api/resource/CloudStorage$1;-><init>(Ljava/lang/String;Lcom/openfeint/api/resource/CloudStorage$ListCB;)V */
(( com.openfeint.api.resource.CloudStorage$1 ) v3 ).launch ( ); // invoke-virtual {v3}, Lcom/openfeint/api/resource/CloudStorage$1;->launch()V
/* .line 119 */
return;
} // .end method
public static void load ( java.lang.String p0, com.openfeint.api.resource.CloudStorage$LoadCB p1 ) {
/* .locals 5 */
/* .param p0, "key" # Ljava/lang/String; */
/* .param p1, "cb" # Lcom/openfeint/api/resource/CloudStorage$LoadCB; */
/* .prologue */
/* .line 137 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v3 ).getUserID ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/OpenFeintInternal;->getUserID()Ljava/lang/String;
/* .line 138 */
/* .local v2, "userID":Ljava/lang/String; */
if ( v2 != null) { // if-eqz v2, :cond_0
v3 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* if-nez v3, :cond_1 */
/* .line 139 */
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 140 */
final String v3 = "A user must be logged in to load data from a CloudStorage blob."; // const-string v3, "A user must be logged in to load data from a CloudStorage blob."
(( com.openfeint.api.resource.CloudStorage$LoadCB ) p1 ).onFailure ( v3 ); // invoke-virtual {p1, v3}, Lcom/openfeint/api/resource/CloudStorage$LoadCB;->onFailure(Ljava/lang/String;)V
/* .line 144 */
} // :cond_1
v3 = com.openfeint.api.resource.CloudStorage .isValidKey ( p0 );
/* if-nez v3, :cond_2 */
/* .line 145 */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 146 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "\'"; // const-string v4, "\'"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* if-nez p0, :cond_3 */
final String v3 = "(null)"; // const-string v3, "(null)"
} // :goto_0
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "\' is not a valid CloudStorage key."; // const-string v4, "\' is not a valid CloudStorage key."
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.openfeint.api.resource.CloudStorage$LoadCB ) p1 ).onFailure ( v3 ); // invoke-virtual {p1, v3}, Lcom/openfeint/api/resource/CloudStorage$LoadCB;->onFailure(Ljava/lang/String;)V
/* .line 150 */
} // :cond_2
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v3 ).getAppID ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/OpenFeintInternal;->getAppID()Ljava/lang/String;
/* .line 152 */
/* .local v0, "appID":Ljava/lang/String; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "/xp/users/"; // const-string v4, "/xp/users/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "/games/"; // const-string v4, "/games/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "/save_cards/"; // const-string v4, "/save_cards/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 153 */
/* .local v1, "path":Ljava/lang/String; */
/* new-instance v3, Lcom/openfeint/api/resource/CloudStorage$2; */
/* invoke-direct {v3, v1, p1}, Lcom/openfeint/api/resource/CloudStorage$2;-><init>(Ljava/lang/String;Lcom/openfeint/api/resource/CloudStorage$LoadCB;)V */
(( com.openfeint.api.resource.CloudStorage$2 ) v3 ).launch ( ); // invoke-virtual {v3}, Lcom/openfeint/api/resource/CloudStorage$2;->launch()V
/* .line 163 */
return;
} // .end local v0 # "appID":Ljava/lang/String;
} // .end local v1 # "path":Ljava/lang/String;
} // :cond_3
/* move-object v3, p0 */
/* .line 146 */
} // .end method
public static void save ( java.lang.String p0, Object[] p1, com.openfeint.api.resource.CloudStorage$SaveCB p2 ) {
/* .locals 5 */
/* .param p0, "key" # Ljava/lang/String; */
/* .param p1, "data" # [B */
/* .param p2, "cb" # Lcom/openfeint/api/resource/CloudStorage$SaveCB; */
/* .prologue */
/* .line 182 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v3 ).getUserID ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/OpenFeintInternal;->getUserID()Ljava/lang/String;
/* .line 183 */
/* .local v2, "userID":Ljava/lang/String; */
if ( v2 != null) { // if-eqz v2, :cond_0
v3 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* if-nez v3, :cond_2 */
/* .line 184 */
} // :cond_0
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 185 */
final String v3 = "Cannot save because the owner of this CloudStorage blob is not logged in."; // const-string v3, "Cannot save because the owner of this CloudStorage blob is not logged in."
(( com.openfeint.api.resource.CloudStorage$SaveCB ) p2 ).onFailure ( v3 ); // invoke-virtual {p2, v3}, Lcom/openfeint/api/resource/CloudStorage$SaveCB;->onFailure(Ljava/lang/String;)V
/* .line 233 */
} // .end local p0 # "key":Ljava/lang/String;
} // :cond_1
} // :goto_0
return;
/* .line 190 */
/* .restart local p0 # "key":Ljava/lang/String; */
} // :cond_2
v3 = com.openfeint.api.resource.CloudStorage .isValidKey ( p0 );
/* if-nez v3, :cond_4 */
/* .line 191 */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 192 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "\'"; // const-string v4, "\'"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* if-nez p0, :cond_3 */
final String p0 = "(null)"; // const-string p0, "(null)"
} // .end local p0 # "key":Ljava/lang/String;
} // :cond_3
(( java.lang.StringBuilder ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "\' is not a valid CloudStorage key."; // const-string v4, "\' is not a valid CloudStorage key."
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.openfeint.api.resource.CloudStorage$SaveCB ) p2 ).onFailure ( v3 ); // invoke-virtual {p2, v3}, Lcom/openfeint/api/resource/CloudStorage$SaveCB;->onFailure(Ljava/lang/String;)V
/* .line 197 */
/* .restart local p0 # "key":Ljava/lang/String; */
} // :cond_4
if ( p1 != null) { // if-eqz p1, :cond_5
/* array-length v3, p1 */
/* if-nez v3, :cond_6 */
/* .line 198 */
} // :cond_5
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 199 */
final String v3 = "data is empty.data must be set before saving."; // const-string v3, "data is empty.data must be set before saving."
(( com.openfeint.api.resource.CloudStorage$SaveCB ) p2 ).onFailure ( v3 ); // invoke-virtual {p2, v3}, Lcom/openfeint/api/resource/CloudStorage$SaveCB;->onFailure(Ljava/lang/String;)V
/* .line 204 */
} // :cond_6
/* array-length v4, p1 */
/* if-ge v3, v4, :cond_7 */
/* .line 205 */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 207 */
final String v3 = "You cannot exceed 256 kB per save card"; // const-string v3, "You cannot exceed 256 kB per save card"
(( com.openfeint.api.resource.CloudStorage$SaveCB ) p2 ).onFailure ( v3 ); // invoke-virtual {p2, v3}, Lcom/openfeint/api/resource/CloudStorage$SaveCB;->onFailure(Ljava/lang/String;)V
/* .line 212 */
} // :cond_7
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v3 ).getAppID ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/OpenFeintInternal;->getAppID()Ljava/lang/String;
/* .line 214 */
/* .local v0, "appID":Ljava/lang/String; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "/xp/users/"; // const-string v4, "/xp/users/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "/games/"; // const-string v4, "/games/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "/save_cards/"; // const-string v4, "/save_cards/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 216 */
/* .local v1, "path":Ljava/lang/String; */
/* new-instance v3, Lcom/openfeint/api/resource/CloudStorage$3; */
/* invoke-direct {v3, v1, p1, p2}, Lcom/openfeint/api/resource/CloudStorage$3;-><init>(Ljava/lang/String;[BLcom/openfeint/api/resource/CloudStorage$SaveCB;)V */
(( com.openfeint.api.resource.CloudStorage$3 ) v3 ).launch ( ); // invoke-virtual {v3}, Lcom/openfeint/api/resource/CloudStorage$3;->launch()V
} // .end method
