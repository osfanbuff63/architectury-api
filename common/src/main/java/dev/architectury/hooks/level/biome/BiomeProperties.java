/*
 * This file is part of architectury.
 * Copyright (C) 2020, 2021, 2022 architectury
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package dev.architectury.hooks.level.biome;

import net.minecraft.world.level.biome.Biome.BiomeCategory;

public interface BiomeProperties {
    ClimateProperties getClimateProperties();
    
    EffectsProperties getEffectsProperties();
    
    GenerationProperties getGenerationProperties();
    
    SpawnProperties getSpawnProperties();
    
    BiomeCategory getCategory();
    
    interface Mutable extends BiomeProperties {
        @Override
        ClimateProperties.Mutable getClimateProperties();
        
        @Override
        EffectsProperties.Mutable getEffectsProperties();
        
        @Override
        GenerationProperties.Mutable getGenerationProperties();
        
        @Override
        SpawnProperties.Mutable getSpawnProperties();
        
        Mutable setCategory(BiomeCategory category);
    }
}
