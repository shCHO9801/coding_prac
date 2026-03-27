SELECT ed.id, ed.genotype, edd.genotype as parent_genotype
FROM ecoli_data ed
JOIN ecoli_data edd ON ed.parent_id = edd.id
WHERE ed.genotype & edd.genotype = edd.genotype
ORDER BY ed.id asc