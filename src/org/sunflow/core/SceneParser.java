package org.sunflow.core;

import org.sunflow.SunflowAPI;
import org.sunflow.SunflowAPIInterface;

/**
 * Simple interface to allow for scene creation from arbitrary file formats.
 */
public interface SceneParser {

    final String CENTER = "center";
    final String COLOR = "color";
    final String DIFF = "diff";
    final String DIFFUSE = "diffuse";
    final String GI_ENGINE = "gi.engine";
    final String NAME = "name";
    final String NONE = "none";
    final String POINTS = "points";
    final String POINT = "point";
    final String VERTEX = "vertex";
    final String RADIUS = "radius";
    final String RADIANCE = "radiance";
    final String SAMPLES = "samples";
    final String SCALE = "scale";
    final String SHADERS = "shaders";
    final String SMOOTH = "scale";
    final String SUBDIVS = "subdivs";
    final String TEXTURE = "texture";
    final String TRANSFORM = "transform";
    final String TRIANGLES = "triangles";    
    final String TRIANGLE_MESH = "triangle_mesh";
    final String TYPE = "type";

    /**
     * Parse the specified file to create a scene description into the provided
     * {@link SunflowAPI} object.
     *
     * @param filename filename to parse
     * @param api scene to parse the file into
     * @return <code>true</code> upon success, or <code>false</code> if errors
     * have occurred.
     */
    public boolean parse(String filename, SunflowAPIInterface api);
}