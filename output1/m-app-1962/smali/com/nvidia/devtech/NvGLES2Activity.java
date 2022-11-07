public abstract class com.nvidia.devtech.NvGLES2Activity extends com.nvidia.devtech.NvGLESActivity {
	 /* .source "NvGLES2Activity.java" */
	 /* # static fields */
	 private static final Integer EGL_CONTEXT_CLIENT_VERSION;
	 private static final Integer EGL_OPENGL_ES2_BIT;
	 private static final Integer EGL_RENDERABLE_TYPE;
	 /* # direct methods */
	 public com.nvidia.devtech.NvGLES2Activity ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 30 */
		 /* invoke-direct {p0}, Lcom/nvidia/devtech/NvGLESActivity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected Boolean initEGL ( ) {
		 /* .locals 6 */
		 /* .prologue */
		 /* const/16 v5, 0x3038 */
		 /* .line 40 */
		 v3 = this.configAttrs;
		 /* if-nez v3, :cond_0 */
		 /* .line 41 */
		 int v3 = 1; // const/4 v3, 0x1
		 /* new-array v3, v3, [I */
		 int v4 = 0; // const/4 v4, 0x0
		 /* aput v5, v3, v4 */
		 this.configAttrs = v3;
		 /* .line 42 */
	 } // :cond_0
	 v2 = this.configAttrs;
	 /* .line 44 */
	 /* .local v2, "oldConf":[I */
	 /* array-length v3, v2 */
	 /* add-int/lit8 v3, v3, 0x3 */
	 /* add-int/lit8 v3, v3, -0x1 */
	 /* new-array v3, v3, [I */
	 this.configAttrs = v3;
	 /* .line 45 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 46 */
	 /* .local v0, "i":I */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* array-length v3, v2 */
/* add-int/lit8 v3, v3, -0x1 */
/* if-lt v0, v3, :cond_1 */
/* .line 48 */
v3 = this.configAttrs;
/* add-int/lit8 v1, v0, 0x1 */
} // .end local v0 # "i":I
/* .local v1, "i":I */
/* const/16 v4, 0x3040 */
/* aput v4, v3, v0 */
/* .line 49 */
v3 = this.configAttrs;
/* add-int/lit8 v0, v1, 0x1 */
} // .end local v1 # "i":I
/* .restart local v0 # "i":I */
int v4 = 4; // const/4 v4, 0x4
/* aput v4, v3, v1 */
/* .line 50 */
v3 = this.configAttrs;
/* add-int/lit8 v1, v0, 0x1 */
} // .end local v0 # "i":I
/* .restart local v1 # "i":I */
/* aput v5, v3, v0 */
/* .line 53 */
int v3 = 3; // const/4 v3, 0x3
/* new-array v3, v3, [I */
/* fill-array-data v3, :array_0 */
/* .line 52 */
this.contextAttrs = v3;
/* .line 57 */
v3 = /* invoke-super {p0}, Lcom/nvidia/devtech/NvGLESActivity;->initEGL()Z */
/* .line 47 */
} // .end local v1 # "i":I
/* .restart local v0 # "i":I */
} // :cond_1
v3 = this.configAttrs;
/* aget v4, v2, v0 */
/* aput v4, v3, v0 */
/* .line 46 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 53 */
/* nop */
/* :array_0 */
/* .array-data 4 */
/* 0x3098 */
/* 0x2 */
/* 0x3038 */
} // .end array-data
} // .end method
