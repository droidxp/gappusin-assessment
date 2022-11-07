public class com.openfeint.internal.Util11 {
	 /* .source "Util11.java" */
	 /* # direct methods */
	 public com.openfeint.internal.Util11 ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Boolean isPad ( android.content.Context p0 ) {
		 /* .locals 5 */
		 /* .param p0, "ctx" # Landroid/content/Context; */
		 /* .prologue */
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 14 */
		 try { // :try_start_0
			 /* const-class v0, Landroid/content/res/Configuration; */
			 /* .line 15 */
			 /* .local v0, "configuration":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
			 final String v4 = "SCREENLAYOUT_SIZE_XLARGE"; // const-string v4, "SCREENLAYOUT_SIZE_XLARGE"
			 (( java.lang.Class ) v0 ).getField ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 /* .line 16 */
			 /* .local v1, "f":Ljava/lang/reflect/Field; */
			 int v4 = 0; // const/4 v4, 0x0
			 v2 = 			 (( java.lang.reflect.Field ) v1 ).getInt ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
			 /* .line 17 */
			 /* .local v2, "mask":I */
			 (( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
			 (( android.content.res.Resources ) v4 ).getConfiguration ( ); // invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
			 /* iget v4, v4, Landroid/content/res/Configuration;->screenLayout:I */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* and-int/2addr v4, v2 */
			 /* if-ne v4, v2, :cond_0 */
			 int v3 = 1; // const/4 v3, 0x1
			 /* .line 20 */
		 } // .end local v0 # "configuration":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
	 } // .end local v1 # "f":Ljava/lang/reflect/Field;
} // .end local v2 # "mask":I
} // :cond_0
} // :goto_0
/* .line 18 */
/* :catch_0 */
/* move-exception v4 */
} // .end method
